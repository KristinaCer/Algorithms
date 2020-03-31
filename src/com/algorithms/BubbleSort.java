package com.algorithms;

public class BubbleSort {
    /*
     Best case efficiency of O(n) when the array is already sorted and worst case (average case) efficiency of O(n^2) when the array is reverse sorted.
     Building the sorted array, sorting from the largest value to the smallest one.
    */

    public static void bubbleSort(int[] someArray){
        int temp;
        for(int i = 0; i < someArray.length - 1; i++){
            for(int j = 1; j < someArray.length; j ++){
                if(someArray[i] < someArray[j]){
                    temp = someArray[i];
                    someArray[i] = someArray[j];
                    someArray[j] = temp;
                }
            }
        }
    }
}