package com.javaguru.lessons.lesson14;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class ProductService {

    /**
     * 6. Написать метод, который принимает список продуктов и возвращает список продуктов, чья цена
     * больше 10.0 ед.
     */
    List<Product> filteredProductsByPrice(List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice().compareTo(BigDecimal.TEN) >= 0) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    /**
     * 7. Написать метод, который принимает список продуктов и возвращает сумму всех цен.
     */

    BigDecimal sumAllProductsPrice(List<Product> products) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : products) {
            if (product.getPrice() != null) {
                sum = sum.add(product.getPrice());
            } else {
                System.out.println("Incorrect product price " + product.getPrice() + ", product id: " +
                        product.getId());
            }
        }
        return sum.setScale(2, RoundingMode.HALF_EVEN);
    }
}
