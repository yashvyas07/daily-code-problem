package com.dailyproblem.java;

/**
 * @author Yash Vyas
 *
 * This problem was asked by Slack.
 *
 * You are given an N by M matrix of 0s and 1s. Starting from the top left corner, how many ways are there to reach the bottom right corner?
 *
 * You can only move right and down. 0 represents an empty space while 1 represents a wall you cannot walk through.
 *
 * For example, given the following matrix:
 *
 * [[0, 0, 1],
 *  [0, 0, 1],
 *  [1, 0, 0]]
 * Return two, as there are only two ways to get to the bottom right:
 *
 * Right, down, down, right
 * Down, right, down, right
 * The top left corner and bottom right corner will always be 0.
 */
public class Problem158 {
    /**
     *
     * @param m
     * @return
     */
    public static int findNoOfWaysToReachToDest(int[][] m) {
        int h=m.length; // height
        int w=m[0].length; // width
        if (h == 1 && w == 1) return 1;
        int[] dp = new int[w];

        dp[0]=1; //1D because we only need previous value to add to.
        for (int i=0;i<h; i++) {
            for (int j=0; j<w; j++) {
                if (m[i][j] == 1) {
                    dp[j]=0; //1 is wall; this route shouldn't be considered for next computation.
                } else if (j>0) {
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[w-1];
    }
}
