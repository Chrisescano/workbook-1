package org.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    static double carRentalPrice = 29.99;
    static double underageSurchargeRate = 0.3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the car rental calculator!");

        String pickUpDate = getStringInput(scanner, "Enter the pickup date: ");
        int numberOfRentalDays = getIntInput(scanner, "Enter how many days you would like to rent: ");
        boolean hasETag = getBooleanInput(scanner, "Would you like to add an electronic toll tag at $3.95/day? (true/false): ");
        boolean hasGPS = getBooleanInput(scanner, "Would you like to add a GPS at $2.85/day? (true/false): ");
        boolean hasRA = getBooleanInput(scanner, "Would you like to add roadside assistance at $3.95/day (true/false): ");
        int age = getIntInput(scanner, "Enter your current age: ");

        double costOfBasicCarRental = numberOfRentalDays * carRentalPrice;
        double optionsCost = calculateOptions(numberOfRentalDays, hasETag, hasGPS, hasRA);
        double underageSurcharge = age < 25 ? costOfBasicCarRental * underageSurchargeRate : 0.0;

        printReceipt(costOfBasicCarRental, optionsCost, underageSurcharge);
    }

    static String getStringInput(Scanner scanner, String msg) {
        System.out.print(msg);
        String input = scanner.next();
        scanner.nextLine();
        return input;
    }

    static int getIntInput(Scanner scanner, String msg) {
        System.out.print(msg);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    static boolean getBooleanInput(Scanner scanner, String msg) {
        System.out.print(msg);
        boolean input = scanner.nextBoolean();
        scanner.nextLine();
        return input;
    }

    static double calculateOptions(int numberOfRentalDays, boolean hasETag, boolean hasGPS, boolean hasRA) {
        double eTagCharge = hasETag ? 3.95 * numberOfRentalDays : 0.0;
        double gpsCharge = hasGPS ? 2.95 * numberOfRentalDays : 0.0;
        double raCharge = hasRA ? 3.95 * numberOfRentalDays : 0.0;
        return eTagCharge + gpsCharge + raCharge;
    }

    static void printReceipt(double costOfBasicRental, double optionsCost, double underageSurcharge) {
        System.out.println("\n       Receipt       ");
        System.out.printf("Basic Car Rental   : %8.2f\n", costOfBasicRental);
        System.out.printf("Options Cost       : %8.2f\n", optionsCost);
        System.out.printf("Underage Surcharge : %8.2f\n", underageSurcharge);
        System.out.printf("Total              : %8.2f\n", (costOfBasicRental + optionsCost + underageSurcharge));
    }
}
