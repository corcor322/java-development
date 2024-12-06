package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.DataSourceConnectionFactory;

import javax.sql.DataSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Application requires a Username and Password");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the lastname of the customer you would like to search: ");
            String lastNameToSearch = scanner.nextLine();

            doSimpleQuery(dataSource, lastNameToSearch);

            System.out.println("==========================================");
            System.out.println("==========================================");
            System.out.println("==========================================");

            doJoin(dataSource, lastNameToSearch);


        } catch (Exception ex) {
            System.out.println("An error has occured.");
            ex.printStackTrace();

        } finally {

        }
    }
    public static void doSimpleQuery(DataSource dataSource, String lastNameToSearch)
}
