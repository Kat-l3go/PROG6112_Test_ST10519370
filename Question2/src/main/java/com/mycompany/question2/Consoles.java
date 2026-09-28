/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author emeris
 */
public abstract class Consoles implements IConsoles {

    public String consoleType;
    public String storeName;
    public int totalSales;

        public Consoles(String consoleType, String storeName, int totalSales) {
            this.consoleType = consoleType;
            this.storeName = storeName;
            this.totalSales = totalSales;
        }

            @Override
            public String getConsoleType() {
                return consoleType;
            }

            @Override
            public String getStore() {
                return storeName;
            }

            @Override
            public int getTotalSales() {
                return totalSales;
            }

            public abstract void printReport();
        }
