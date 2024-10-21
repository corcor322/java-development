package com.pluralsight;
//TODO: Test & Debug
import java.io.BufferedReader;
import java.io.FileReader;

public class Payroll {
    public static void main(String[] args) {
        String fileName ="employees.csv";

        try {
            BufferedReader reader = new BufferedReader(FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
            float hoursWorked = Float.parseFloat(tokens[2]);
            float payRate = Float.parseFloat(tokens[3]);

            Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                            employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}
