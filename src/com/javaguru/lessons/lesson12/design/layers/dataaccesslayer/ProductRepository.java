package com.javaguru.lessons.lesson12.design.layers.dataaccesslayer;

import java.util.HashMap;
import java.util.Map;

/**
 * DAL = Data Access Layer
 */
public class ProductRepository {

    private Map<Long, Product> database = new HashMap<>();
    private Long productIdSequence = 0L;

    public Product save(Product product) {
        product.setId(productIdSequence);
        database.put(product.getId(), product);
        productIdSequence++;
        return product;
    }
}
