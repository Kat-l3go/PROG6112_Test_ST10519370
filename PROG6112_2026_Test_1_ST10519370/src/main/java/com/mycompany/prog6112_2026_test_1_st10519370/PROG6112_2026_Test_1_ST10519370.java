/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112_2026_test_1_st10519370;

/**
 *
 * @author emeris
 */
public class PROG6112_2026_Test_1_ST10519370 {

    public static void main(String[] args) {
    
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"}; // single dimension array
            String[] consoles = {"Ps5", "Xbox", "Nintemto Switch"};

            int[][] sales = { // two dimension array
                {1000, 2000, 3000},   // Cape Town
                {2000, 3000, 4000},   // Port Elizabeth
                {1500, 1100, 1200}    // Pretoria
            };

            int[] cityCalculations = new int[3]; // calculations
                cityCalculations[0] = 1000 + 2000 + 3000;   // calculation for Cape Town
                cityCalculations[1] = 2000 + 3000 + 4000;   // calculation for Port Elizabeth
                cityCalculations[2] = 1500 + 1100 + 1200;   // calculation for Pretoria

            int maxIndex = 0; //finding the max
                for (int i = 1; i < cityCalculations.length; i++) {
                    if (cityCalculations[i] > cityCalculations[maxIndex]) {
                        maxIndex = i;
                    }
            }

            System.out.println("\nGaming console report");

                System.out.printf("%-18s", "");
                    for (String console : consoles) {
                        System.out.printf("%-10s", console);
                }
                System.out.println();

                    for (int i = 0; i < cities.length; i++) {
                        System.out.printf("%-18s", cities[i].toUpperCase());
                            for (int j = 0; j < consoles.length; j++) {
                                System.out.printf("%-10d", sales[i][j]);
                        }
                        System.out.println();
                }

                    System.out.println("\nConsole sales total for each city");

                    for (int i = 0; i < cities.length; i++) {
                        System.out.printf("%-18s%d%n", cities[i].toUpperCase(), cityCalculations[i]);
                }   

                    System.out.println("\nCity with the most sales: " + cities[maxIndex].toUpperCase());
            }
}

