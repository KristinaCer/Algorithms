package com.algorithms;

public class BubbleSort {
    /*
     Best case efficiency of O(n) when the array is already sorted and worst case (average case) efficiency of O(n^2) when the array is reverse sorted.
     Building the sorted array, sorting from the largest value to the smallest one.
     Number of comparisons in the worst case scenario:
     (n-1) + (n-2) + (n-3) + ..... + 3 + 2 + 1
     Sum = n(n-1)/2
      i.e O(n2)
        */

    public static void bubbleSort(int[] someArray){
        int temp;
        for(int i = 0; i < someArray.length - 1; i++){
            for(int j = i + 1; j < someArray.length; j ++){
                if(someArray[j] < someArray[i]){
                    temp = someArray[j];
                    someArray[j] = someArray[i];
                    someArray[i] = temp;
                }
            }
        }
    }
}