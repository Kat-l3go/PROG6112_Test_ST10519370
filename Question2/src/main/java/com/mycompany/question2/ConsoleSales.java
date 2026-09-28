/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

        @Override
        public void printReport() {
            System.out.println("\nConsole sales report ");
            System.out.println("\nConsole Type : " + getConsoleType());
            System.out.println("Store Name   : " + getStore());
            System.out.println("Total Sales  : " + getTotalSales());
        }
}
