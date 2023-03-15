package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stock {
    private String name;
    private int numShares;
    private double price;

    public Stock(String name, int numShares, double price) {
        this.name = name;
        this.numShares = numShares;
        this.price = price;
    }

    public double getValue() {
        return numShares * price;
    }

    public String getName() {
        return name;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getPrice() {
        return price;
    }
}

class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("Stock Report:");
        for (Stock stock : stocks) {
            System.out.printf("%s\t%d\t%.2f\t%.2f\n",
                    stock.getName(), stock.getNumShares(), stock.getPrice(), stock.getValue());
        }
        System.out.printf("Total value of portfolio: %.2f\n", getTotalValue());
    }
}
