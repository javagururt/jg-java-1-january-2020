package com.javaguru.lessons.lesson10.validationv2;

class ProductNameValidationRule implements ValidationRule {

    public void validate(Product product) {
        checkNotNull(product);
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new ProductValidationException("Product name must be not empty.");
        }
    }
}
