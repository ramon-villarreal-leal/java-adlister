package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.*;

import com.mysql.cj.api.mysqla.result.Resultset;
import com.mysql.cj.jdbc.Driver;

public class MySqlUsersDao implements Users {
    //instance of connection object that alllows users to have connection to the database
    private Connection connection;

    public MySqlUsersDao (Config config) {
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch(SQLException e){
            throw new RuntimeException("Error connecting to the Database!", e);
        }

    }


    @Override
    public User findByUsername(String username) {
        //===============CREATING A PREPARED STATEMENT SET IT TO NULL====
        PreparedStatement stmt = null; //====== needs to change to not like=======/
        String sqlQuery = "SELECT * FROM users WHERE username LIKE ?";
        String userInput = "%" + username + "%";

        try{
            //===========SETTING sqlQuery so it can be protected
            stmt = connection.prepareStatement(sqlQuery);
            stmt.setString(1, userInput);

            stmt.executeQuery();
            // Actual result set that would give us back the user record // get geenrated keys in mysqlAdsDao gives back ID
            ResultSet rs = stmt.getResultSet();
            rs.next();
            return extractUser(rs);

        } catch(SQLException e){
            throw new RuntimeException("Error retrieving from Query", e);
        }
    }


    public User extractUser(ResultSet rs) throws SQLException{
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }


    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username,email,password) VALUES (?,?,?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());


            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user", e);
        }
    }
}
