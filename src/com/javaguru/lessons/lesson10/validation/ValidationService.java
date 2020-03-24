package com.javaguru.lessons.lesson10.validation;

import java.math.BigDecimal;

class ValidationService {

    void validate(Product product) {
        checkProductNotNull(product);
        checkProductName(product);
        checkProductPrice(product);
    }

    private void checkProductNotNull(Product product) {
        if (product == null) {
            throw new ProductValidationException("Product must be not null.");
        }
    }

    private void checkProductPrice(Product product) {
        if (product.getPrice() == null || product.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new ProductValidationException("Product price must be more than 0.");
        }
    }

    private void checkProductName(Product product) {
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new ProductValidationException("Product name must be not empty.");
        }
    }

}
