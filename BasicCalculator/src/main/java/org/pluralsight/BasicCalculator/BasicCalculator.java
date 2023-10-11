package org.pluralsight.BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = getDoubleInput("Enter the first number: ");
        double num2 = getDoubleInput("Enter the second number: ");
        char option = getCharInput("Possible Calculation:\n (A)dd\n (S)ubtract\n (M)ultiply\n (D)ivide\n" +
                "Please select an option: ");

        double answer;
        switch(option) {
            case 'A', 'a':
                answer = num1 + num2;
                option = '+';
                break;
            case 'S', 's':
                answer = num1 - num2;
                option = '-';
                break;
            case 'M', 'm':
                answer = num1 * num2;
                option = '*';
                break;
            case 'D', 'd':
                answer = num1 / num2;
                option = '/';
                break;
            default:
                answer = 0;
        }
        System.out.printf("\n%.3f %c %.3f = %.3f", num1, option, num2, answer);
    }

    static double getDoubleInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    static char getCharInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String input = scanner.nextLine();
        return input.charAt(0);
    }
}