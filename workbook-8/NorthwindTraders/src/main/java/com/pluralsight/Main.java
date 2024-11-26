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
        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM northwind.products";

        // execute query
        ResultSet results = statement.executeQuery(query);

        // process results
        while(results.next()) {
            int productID = results.getInt("ProductID");
            String productName = results.getString("ProductName");
            double unitPrice = results.getDouble("UnitPrice");
            int unitsInStock = results.getInt("UnitsInStock");
            System.out.println("Product Id: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + unitPrice);
            System.out.println("Stock: " + unitsInStock);
            System.out.println("-------------------");}

        // close connection
        results.close();
        statement.close();
        connection.close();

    }
}
