package com.javaguru.lessons.lesson12.design.layers.businesslogic;


import com.javaguru.lessons.lesson12.design.layers.dataaccesslayer.Product;
import com.javaguru.lessons.lesson12.design.layers.dataaccesslayer.ProductRepository;

/**
 * BL = Business Layer
 */
/*
Добавить продукт
найти продукт по id
 */
public class ProductService {

    private ValidationService validationService = new ValidationService();
    private ProductRepository repository = new ProductRepository();

    public void addProduct(Product product) {
        validationService.validateProduct(product);
        // external call

        repository.save(product);
    }
}
