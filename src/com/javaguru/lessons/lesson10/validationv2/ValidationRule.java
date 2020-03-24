package com.javaguru.lessons.lesson10.validationv2;

public interface ValidationRule {

    void validate(Product product);

    default void checkNotNull(Product product) {
        if (product == null) {
            throw new ProductValidationException("Product must be not null.");
        }
    }

}
