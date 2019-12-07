package com.dailyproblem.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem159Test {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test_null() {
        Character expected = Problem159.findFirstReoccurringChar(null);
        assertNull(expected);
    }

    @Test
    public void test_empty() {
        Character actual = Problem159.findFirstReoccurringChar("");
        assertNull(actual);
    }

    @Test
    public void findFirstReoccuringChar() {
        Character actual = Problem159.findFirstReoccurringChar("acbbac");
        assertEquals(new Character('b'), actual);
    }

    @Test
    public void findFirstReoccuringChar_noreoccurance() {
        Character actual = Problem159.findFirstReoccurringChar("abcdef");
        assertNull(actual);
    }

    @Test
    public void findFirstReoccuringChar_single_char() {
        Character actual = Problem159.findFirstReoccurringChar("a");
        assertNull(actual);
    }
}
