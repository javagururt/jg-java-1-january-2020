package com.javaguru.lessons.lesson14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("apple",
                "orange",
                "a",
                "b",
                "milk"
        );

        /*
        stringStream
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        if (s.length() < 2) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                })
                .forEach(element -> System.out.println(element));
         */

        // "apple", "orange", "a", "b", "milk"
        stringStream
                .filter(element -> element.length() < 2)
                .map(element -> {
                    System.out.println(element);
                    return element.toUpperCase();
                })
                .forEach(s -> System.out.println(s));


        Stream<String> stringStream2 = Stream.of("apple",
                "orange",
                "a",
                "b",
                "milk"
        );

        System.out.println("Stream Example 2");
        String string = stringStream2
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(string);

        List<String> stringList = Stream.of("A 2 C 3 B 4".split(" "))
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}
