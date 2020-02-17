package com.javaguru.lessons.lesson5;

class MarketApplication {

    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 100.0);
        ibm.printInformation();

        ibm.updatePrice(120);
        ibm.printInformation();

        ibm.updatePrice(80);
        ibm.printInformation();

        ibm.updatePrice(90);
        ibm.printInformation();

        ibm.updatePrice(-1);
        ibm.printInformation();

    }
}
