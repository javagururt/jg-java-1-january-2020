package com.javaguru.lessons.lesson14;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductServiceTest {


    private ProductService victim = new ProductService();

    @Test
    public void shouldReturnProductsWithPriceMoreThan10() {
        List<Product> products = Arrays.asList(new Product(1L, "Apple", new BigDecimal("7.5")),
                new Product(2L, "Mango", new BigDecimal("3")),
                new Product(3L, "Meat", new BigDecimal("20")),
                new Product(4L, "Milk", new BigDecimal("10"))
        );

        List<Product> actual = victim.filteredProductsByPrice(products);

        List<Product> expectedProducts = Arrays.asList(
                new Product(3L, "Meat", new BigDecimal("20")),
                new Product(4L, "Milk", new BigDecimal("10"))
        );

        assertNotNull(actual);
        assertEquals(2, actual.size());
        assertEquals(expectedProducts, actual);
    }

    @Test
    public void shouldSumAllProductsPrice() {
        List<Product> products = Arrays.asList(new Product(1L, "Apple", new BigDecimal("7.51")),
                new Product(2L, "Mango", new BigDecimal("3")),
                new Product(3L, "Meat", new BigDecimal("19.999")),
                new Product(4L, "Milk", new BigDecimal("10.0")),
                new Product(5L, "Orange", null)
        );

        BigDecimal actual = victim.sumAllProductsPrice(products);

        assertNotNull(actual);
        assertEquals(new BigDecimal("40.51"), actual);
    }
}