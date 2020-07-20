
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCTest {


    private static List<String> getEmployeeFirstNames() {
        List<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            //========creating a statement

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT first_name from employees.employees limit 10");

            while(rs.next()){
                names.add(rs.getString("first_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
      return names;
    }


    private static List<String> getEmployeeFirstNames(int n) {
        List<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            //========creating a statement

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT first_name from employees.employees limit " + n);

            while(rs.next()){
                names.add(rs.getString("first_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }


    public static void main(String[] args) {
        System.out.println(getEmployeeFirstNames());
        System.out.println(getEmployeeFirstNames(4));
    }
}
