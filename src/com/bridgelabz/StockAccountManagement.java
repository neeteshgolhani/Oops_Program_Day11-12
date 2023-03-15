package com.bridgelabz;

import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();
        for (int i = 0; i < numStocks; i++) {
            System.out.printf("Enter stock %d information (name numShares price): ", i + 1);
            String name = scanner.next();
            int numShares = scanner.nextInt();
            double price = scanner.nextDouble();
            Stock stock = new Stock(name, numShares, price);
            portfolio.addStock(stock);
        }
        portfolio.printStockReport();
    }
}
