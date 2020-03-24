package com.javaguru.lessons.lesson10.validationv2;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

class ValidationServiceDemo {

    public static void main(String[] args) {
        try {
            Product product = new Product();
            product.setName("Apple");
            product.setPrice(new BigDecimal("100.00"));
            Set<ValidationRule> rules = new HashSet<>();
            rules.add(new ProductNameValidationRule());
            rules.add(new ProductPriceValidationRule());

            ValidationService validationService = new ValidationService(rules);
            validationService.validateProduct(product);
        } catch (ProductValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
