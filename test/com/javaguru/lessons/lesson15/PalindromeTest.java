package com.javaguru.lessons.lesson15;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome victim = new Palindrome();

    @Test//word 'kazak' should be palindrome
    public void shouldBePalindrome() {
        boolean actual = victim.isPalindrome("kazak");
        assertTrue(actual);
    }

    @Test
    public void shouldIgnoreSpacesInPalindromeText() {
        boolean actual = victim.isPalindrome("al la a    ll a");
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenNotPalindrome() {
        boolean actual = victim.isPalindrome("abc");
        assertFalse(actual);
    }

    @Test
    public void shouldIgnoreCaseInText() {
        boolean actual = victim.isPalindrome("Kazak");
        assertTrue(actual);
    }
}