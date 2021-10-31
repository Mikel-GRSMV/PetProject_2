package ru.folder.exampleConnection;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        String dbUser = "postgres";
        String dbPassword = "YOUR PASSWORD";
        String connectionURL = "jdbc:postgresql://localhost:5433/UsersPetProject";

        try {
            Connection connection = DriverManager.getConnection(connectionURL, dbUser, dbPassword);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM our_user");

            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
