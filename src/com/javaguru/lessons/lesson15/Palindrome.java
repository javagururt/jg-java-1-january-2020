package com.javaguru.lessons.lesson15;

class Palindrome {

    boolean isPalindrome(String text) {
        text = text.replace(" ", "");
        text = text.toLowerCase();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
