package com.dailyproblem.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem158Test {

    int[][] m = {{0, 0, 1}, {0, 0, 1}, {1, 0, 0}};

    @Test
    public void findNoOfWaysToReachToDest_single_value() {
        int[][] k = {{0}};
        int actual = Problem158.findNoOfWaysToReachToDest(k);
        assertEquals(1, actual);
    }

    @Test
    public void findNoOfWaysToReachToDest() {
        int actual = Problem158.findNoOfWaysToReachToDest(m);
        assertEquals(2, actual);
    }

    @Test
    public void findNoOfWaysToReachToDest_no_route() {
        int[][] k = {{1,1,1}, {1,1,1}, {1,1,1}};
        int actual = Problem158.findNoOfWaysToReachToDest(k);
        assertEquals(0, actual);
    }

    @Test
    public void findNoOfWaysToReachToDest_1D_array() {
        int[][] k = {{0,0,0,0}};
        int actual = Problem158.findNoOfWaysToReachToDest(k);
        assertEquals(1, actual);
    }
}
