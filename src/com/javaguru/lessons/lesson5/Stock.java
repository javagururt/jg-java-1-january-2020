package com.javaguru.lessons.lesson5;

class Stock {

    private String company;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String company, double currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Incorrect price");
            return;
//            throw new IllegalArgumentException("Incorrect price");
        }
        currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.println("Company name: " + company);
        System.out.println("Current price: " + currentPrice);
        System.out.println("Min. price: " + minPrice);
        System.out.println("Max. price: " + maxPrice);
    }
}
