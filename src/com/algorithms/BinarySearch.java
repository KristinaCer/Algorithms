package com.algorithms;

import java.sql.Array;
import java.util.Arrays;

public class BinarySearch {

    /*
    Best case efficiency of O(1) and worst case (average case) efficiency of O(log n).
     */
    public static boolean binarySearch(int[] someArray, int integerOfInterest) {

        Arrays.sort(someArray);

        int low = someArray[0];
        int high = someArray.length - 1;
        int middle = 0;

        while (low <= high) {
            middle = (low + high) / 2;
            if (someArray[middle] == integerOfInterest) {
                return true;
            } else if (someArray[middle] < integerOfInterest) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return false;
    }
}


