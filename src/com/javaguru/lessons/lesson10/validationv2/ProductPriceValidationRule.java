package com.javaguru.lessons.lesson10.validationv2;

import java.math.BigDecimal;

class ProductPriceValidationRule implements ValidationRule {

    public void validate(Product product) {
        checkNotNull(product);
        if (product.getPrice() == null || product.getPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new ProductValidationException("Product price must be more than 0.");
        }
    }
}
