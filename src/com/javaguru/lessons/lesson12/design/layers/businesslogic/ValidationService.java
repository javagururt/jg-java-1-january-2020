package com.javaguru.lessons.lesson12.design.layers.businesslogic;

import com.javaguru.lessons.lesson12.design.layers.dataaccesslayer.Product;

public class ValidationService {

    void validateProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product must be not null.");
        }
        if (product.getName() == null) {
            throw new IllegalArgumentException("Product name must be not null.");
        }
    }
}
