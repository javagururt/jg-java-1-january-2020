package com.javaguru.lessons.lesson10.validationv2;

import java.util.Set;

class ValidationService {

    private Set<ValidationRule> rules;

    public ValidationService(Set<ValidationRule> rules) {
        this.rules = rules;
    }

    void validateProduct(Product product) {
        for (ValidationRule rule : rules) {
            rule.validate(product);
        }

//        rules.forEach(rule -> rule.validate(product));
    }
}
