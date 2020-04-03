package com.javaguru.lessons.lesson10.validation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;

public class ValidationServiceTest {

    public static final String PRODUCT_NAME = "Apple";

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private ValidationService victim = new ValidationService();

    @Test
    public void shouldThrowExceptionWhenProductNull() {
        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product must be not null.");

        victim.validate(null);
    }

    @Test
    public void shouldThrowExceptionWhenProductPriceNull() {
        Product product = new Product();
        product.setName(PRODUCT_NAME);
        product.setPrice(null);

        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product price must be more than 0.");

        victim.validate(product);
    }

    @Test
    public void shouldThrowExceptionWhenProductPriceZero() {
        Product product = new Product();
        product.setName(PRODUCT_NAME);
        product.setPrice(BigDecimal.ZERO);

        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product price must be more than 0.");

        victim.validate(product);
    }

    @Test
    public void shouldThrowExceptionWhenProductPriceZeroOrLess() {
        Product product = new Product();
        product.setName(PRODUCT_NAME);
        product.setPrice(new BigDecimal("-123"));

        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product price must be more than 0.");

        victim.validate(product);
    }

    @Test
    public void shouldThrowExceptionWhenProductNameNull() {
        Product product = new Product();
        product.setPrice(BigDecimal.TEN);
        product.setName(null);

        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product name must be not empty.");

        victim.validate(product);
    }

    @Test
    public void shouldThrowExceptionWhenProductNameEmpty() {
        Product product = new Product();
        product.setPrice(BigDecimal.TEN);
        product.setName("");

        exception.expect(ProductValidationException.class);
        exception.expectMessage("Product name must be not empty.");

        victim.validate(product);
    }

    @Test
    public void shouldValidateSuccess() {
        Product product = new Product();
        product.setPrice(BigDecimal.TEN);
        product.setName(PRODUCT_NAME);

        victim.validate(product);
    }
}