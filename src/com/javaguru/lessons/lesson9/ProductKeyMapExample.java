package com.javaguru.lessons.lesson9;

import java.util.HashMap;
import java.util.Map;

class ProductKeyMapExample {

    public static void main(String[] args) {
        Map<ProductKey, String> productKeyStringMap = new HashMap<>();
        productKeyStringMap.put(new ProductKey("Apple", 10.0), "Tasty apples");
        System.out.println(productKeyStringMap);
        String appleDescription = productKeyStringMap.get(new ProductKey("Apple", 10.0));
        System.out.println("Apple description = " + appleDescription);
    }
}
