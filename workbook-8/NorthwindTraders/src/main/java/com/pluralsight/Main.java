package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // open connection to database
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "P@ssw0rd");

        //create statement
        Statement statement = connection.createStatement();

        // define query
        String query = "SELECT ProductName FROM northwind.products";

        // execute query
        ResultSet results = statement.executeQuery(query);

        // process results
        while(results.next()) {
            String productName = results.getString("ProductName");
            System.out.println(productName);}

        // close connection
        connection.close();

    }
}
