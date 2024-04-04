package com.learning.core.day2session1;

import java.util.Arrays;
 
public class D02P054 {

 
    // Recursive function to find the minimum number of deletions
    private static int minDeletions(String str, int i, int j)
    {
        if (i >= j)
        {
            return 0;
        }
 
        if (str.charAt(i) == str.charAt(j))
        {
            return minDeletions(str, i + 1, j - 1);
        }
 
        // If characters are not equal, consider two options:
        // 1. Delete character at index i
        // 2. Delete character at index j
        return 1 + Math.min(minDeletions(str, i + 1, j), minDeletions(str, i, j - 1));
    }
 
    public static void main(String[] args) {
        String inputString = "aebcbda"; // Example input string
 
        int minDeletions = minDeletions(inputString, 0, inputString.length() - 1);
        System.out.println( + minDeletions);
    }
}
 
