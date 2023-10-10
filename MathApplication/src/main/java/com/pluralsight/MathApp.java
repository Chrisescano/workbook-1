package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {
        System.out.println("1. Highest Salary");
        int bobSalary = 320000, garySalary = 650000;
        int highestSalaray = Math.max(bobSalary, garySalary);
        System.out.printf("   The highest salary is $%d\n\n", highestSalaray);

        System.out.println("2. Smallest Vehicle Price");
        int carPrice = 20000, truckPrice = 900000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.printf("   The smallest vehicle price is $%d\n\n", smallestPrice);

        System.out.println("3. Area of Circle");
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.printf("   If a circle has a radius of %.3f then its area is %.3f\n\n", radius, areaOfCircle);

        System.out.println("4. Square root of variable");
        double numToBeSquared = 5.0;
        double numSquared = Math.sqrt(numToBeSquared);
        System.out.printf("   The square root of %.3f is %f\n\n", numToBeSquared, numSquared);

        System.out.println("5. Distance between two points");
        int x1 = 5, y1 = 85, x2 = 10, y2 = 50;
        double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("   The distance between (%d,%d) and (%d,%d) is %.3f\n\n", x1, y1, x2, y2, distanceBetweenPoints);

        System.out.println("6. Absolute value of a number");
        double numToAbs = -3.5;
        double absValueOfNum = Math.abs(numToAbs);
        System.out.printf("   The absolute value of %.3f is %.3f\n\n", numToAbs, absValueOfNum);

        System.out.println("7. Display random number(between 0 and 1)");
        double randomNumber = Math.random();
        System.out.printf("   Your lucky random number is %f", randomNumber);
    }
}
