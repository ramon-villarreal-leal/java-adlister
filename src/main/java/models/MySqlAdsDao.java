package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlAdsDao implements Ads {

    private Connection connection;

    public MySqlAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());

        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
//                reference this!
//                private long id;
//                private long userId;
//                private String title;
//                private String description;
                output.add(new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
                ));
            }

        }catch(SQLException e) {
            e.printStackTrace();
        }
        return output;
    }

    @Override
    public Long insert(Ad ad) {
        long lastInsertedId = 0;

        String insertQuery = String.format(
                "INSERT INTO ads (id, user_id, title, description) VALUES ('%d', '%d', '%s', '%s')",
                ad.getId(),
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if(generatedKeys.next()) {
                lastInsertedId = generatedKeys.getLong(1);
            }


        } catch(SQLException e) {
            e.printStackTrace();
        }


        return lastInsertedId;
    }

    public static void main(String[] args) {
        //ads is interface that MySql is implementing
        Ads adsDao = new MySqlAdsDao(new Config());
        System.out.println(adsDao.all());

        Ad testAd = new Ad(1, "Test ad title","Test");
        //pass in new ad we created
        System.out.println(adsDao.insert(testAd));
    }
}
