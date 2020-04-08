package com.javaguru.lessons.lesson12.design.layers.userinterface;


import com.javaguru.lessons.lesson12.design.layers.businesslogic.ProductService;
import com.javaguru.lessons.lesson12.design.layers.dataaccesslayer.Product;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *  UI = User Interface
 */
public class ConsoleUI {

    private ProductService service = new ProductService();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add product");
        //...
        Product product = new Product();
        System.out.println("Please enter product name:");
        String name = scanner.nextLine();
        product.setName(name);

        System.out.println("Please enter product price:");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        product.setPrice(price);

        service.addProduct(product);
    }
}
