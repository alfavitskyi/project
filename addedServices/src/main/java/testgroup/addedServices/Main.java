package testgroup.addedServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/abonenty?useUnicode=true&serverTimezone=UTC&useSSL=false";
        String userName = "root";
        String password = "35403540";
        System.out.println("Connecting ...");
        try (Connection connection = DriverManager.getConnection(url, userName, password)){
            System.out.println("Connection succesfull!");
        }
        catch (SQLException e){
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
