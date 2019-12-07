package com.dailyproblem.java;

/**
 * @author Yash Vyas
 *
 * This problem was asked by Amazon.
 *
 * Given a string, determine whether any permutation of it is a palindrome.
 *
 * For example, carrace should return true, since it can be rearranged to form racecar, which is a palindrome.
 * daily should return false, since there's no rearrangement that can form a palindrome.
 *
 * Solution runtime : O(N)+O(1) = O(N); where N=number of chars in input string
 */
public class Problem157 {
    /**
     *
     * @param s input string
     * @return true if any permutaion of the given string is palindrome.
     */
    public static boolean isPermutationPalindrome(String s) {
        if (s == null || s.length() <1) return false;
        if (s.length() == 1) return true;

        int[] x = new int[26];
        for(char c:s.toCharArray()) {
            int m = c-'a';
            x[m] += 1;
        }
        // check parity for chars
        return checkParity(x, s.length() % 2==0);
    }

    /**
     *
     * @param x array to hold count for each char
     * @param isEven len of the string
     * @return
     */
    private static boolean checkParity(int[] x, boolean isEven) {
        // if chars in the string is even then we want to make sure
        // each char occurs in multiples of 2 to satisfy condition.
        // otherwise only one char should occur in odd number
        int oddCounter = -1;
        for (int i:x) {
            if (i>0 && i%2!=0) {
                oddCounter += 1;
            }
        }
        return (oddCounter > 0)?false:true;
    }
}
