package com.javaguru.lessons.lesson5;

class StockTest {

    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.shouldChangeMaxPriceAndCurrentPrice();
    }

    void shouldChangeMaxPriceAndCurrentPrice() {
        Stock victim = new Stock("IBM", 100);
        victim.updatePrice(120);

        double currentActualPrice = victim.getCurrentPrice(); // 120
        double minActualPrice = victim.getMinPrice(); // 100
        double maxActualPrice = victim.getMaxPrice(); // 120

        double expectedCurrentPrice = 120;
        double expectedMinPrice = 100;
        double expectedMaxPrice = 120;

        if (currentActualPrice == expectedCurrentPrice
                && minActualPrice == expectedMinPrice
                && maxActualPrice == expectedMaxPrice) {
            System.out.println("shouldChangeMaxPriceAndCurrentPrice: SUCCESS");
        } else {
            System.out.println("shouldChangeMaxPriceAndCurrentPrice: FAIL");
        }

    }
}
