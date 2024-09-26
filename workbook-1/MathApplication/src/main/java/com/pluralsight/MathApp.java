package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        //then use System.out.println() to display results
        //ex: System.out.println("The answer is " + answer);

        //REPEAT FOR NEXT EXERCISE
        // 1. Display highest salary between Bob and Gary
        int bobSalary = 40000;
        int garySalary = 50000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        // 2. Display lowest price between car and truck
        int carPrice = 25000;
        int truckPrice = 30000;
        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println(lowestPrice);

        // 3. Display area of circle with a 7.25 radius
        double circleRadius = 7.25;
        double circleRadiusSq = Math.pow(circleRadius, 2);
        double circleArea = Math.PI * circleRadiusSq;

        System.out.println(circleArea);

        // 4. Display square root of variable set to 5.0
        double x = 5.0;
        System.out.println(Math.sqrt(x));

        // 5. Display distance between points (5,10) and (85,50)
        double pointsDistance = Math.hypot(85-5, 50-10);

        System.out.println(pointsDistance);

        // 6. Display absolute value of variable set to -3.8
        float y = -3.8f;

        System.out.println(Math.abs(y));

        // 7. Display random number between 0 and 1
        System.out.println(Math.random());
    }
}
