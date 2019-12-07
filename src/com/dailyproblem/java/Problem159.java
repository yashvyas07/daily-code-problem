package com.dailyproblem.java;

/**
 * @author Yash Vyas
 *
 * This problem was asked by Google.
 * Given a string, return the first recurring character in it, or null if there is no recurring character.
 * For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */
public class Problem159 {
    /**
     *
     * @param s input string
     * @return first reoccurring char
     */
    public static Character findFirstReoccurringChar(String s) {
        if (s == null || s.length() == 0) return null;
        int[] bucket = new int[26];

        for (int i=0; i<s.length(); i++) {
            int x = s.charAt(i) - 'a';
            if(bucket[x] > 0)
                return s.charAt(i);
            bucket[x] = bucket[x]+1;
        }

        return null;
    }
}
