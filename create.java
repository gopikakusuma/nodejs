package fullstack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {

    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/me", "root", "1234");

            Statement statement = connection.createStatement();
            
            String sql = "CREATE TABLE student (id INT, name VARCHAR(20), marks INT)";
            statement.executeUpdate(sql);

            System.out.println("Table Created");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
