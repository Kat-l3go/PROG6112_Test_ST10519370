/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author emeris
 */
import java.util.Scanner;

public class Question2
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] consoleTypes = {"PS5", "XBOX", "SWITCH"};

        System.out.println("Select the console type");
        for (int i = 0; i < consoleTypes.length; i++) {
            System.out.println((i + 1) + ". " + consoleTypes[i]);
        }

        int choice = 0;
        while (choice < 1 || choice > consoleTypes.length) {
            System.out.print("Enter your choice (1-3): ");
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = 0;
            }
            if (choice < 1 || choice > consoleTypes.length) {
                System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            }
        }
        String consoleType = consoleTypes[choice - 1];

        System.out.print("Enter the store name: ");
        String storeName = input.nextLine().trim();

        int totalSales = -1;
        while (totalSales < 0) {
            System.out.print("Enter the total amount of sales: ");
            try {
                totalSales = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                totalSales = -1;
            }
            if (totalSales < 0) {
                System.out.println("Invalid amount. Please enter a whole number of 0 or more.");
            }
        }

        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
        sales.printReport();

        input.close();
    }
}
