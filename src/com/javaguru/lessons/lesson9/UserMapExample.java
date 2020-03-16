package com.javaguru.lessons.lesson9;

import java.util.HashMap;
import java.util.Map;

class UserMapExample {

    public static void main(String[] args) {
        Map<Long, UserDetails> userDetailsMap = new HashMap<>();
        userDetailsMap.put(0L, new UserDetails(20, "Vasya"));
        userDetailsMap.put(0L, new UserDetails(25, "Vasya"));
        System.out.println(userDetailsMap);
        System.out.println(userDetailsMap.get(0L));
    }
}
