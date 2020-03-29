package com.company;

public class LinearSearch {

    public static boolean linearSearch (int[] someIntArray, int intOfInterest) {
        for (int currentInt : someIntArray) {
            if (currentInt == intOfInterest) {
                return true;
            }
        }
        return false;
    }
}
