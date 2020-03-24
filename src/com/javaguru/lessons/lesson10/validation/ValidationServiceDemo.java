package com.javaguru.lessons.lesson10.validation;

import java.math.BigDecimal;

class ValidationServiceDemo {

    public static void main(String[] args) {
        ValidationService service = new ValidationService();
        Product product = new Product();
        product.setName("Apple");
        product.setPrice(new BigDecimal("-123"));
        try {
            service.validate(product);
        } catch (ProductValidationException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
