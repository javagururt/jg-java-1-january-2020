package com.javaguru.lessons.lesson9;

import java.util.Objects;

class ProductKey {

    private String name;
    private Double price;

    public ProductKey(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductKey that = (ProductKey) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "ProductKey{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
