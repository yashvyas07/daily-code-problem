package com.dailyproblem.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem157Test {

    @Test
    public void isPermutationPalindrome_null() {
        boolean actual = Problem157.isPermutationPalindrome(null);
        assertFalse(actual);
    }

    @Test
    public void isPermutationPalindrome_empty() {
        boolean actual = Problem157.isPermutationPalindrome("");
        assertFalse(actual);
    }

    @Test
    public void isPermutationPalindrome_single_char() {
        boolean actual = Problem157.isPermutationPalindrome("a");
        assertTrue(actual);
    }

    @Test
    public void isPermutationPalindrome_palindrome() {
        boolean actual = Problem157.isPermutationPalindrome("carrace");
        System.out.printf("actual:" + actual);
        assertTrue(actual);
    }

    @Test
    public void isPermutationPalindrome_palindrome_odd_chars() {
        boolean actual = Problem157.isPermutationPalindrome("abcdcba");
        assertTrue(actual);
    }

    @Test
    public void isPermutationPalindrome_nonpalindrome() {
        boolean actual = Problem157.isPermutationPalindrome("daily");
        assertFalse(actual);
    }
}
