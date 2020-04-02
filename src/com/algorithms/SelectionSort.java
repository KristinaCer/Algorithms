package com.algorithms;

public class SelectionSort {

    /*
    Repeat until no sorted elements remain:
        - search the unsorted part of the data to find the smallest value
        - Swap the smallest found value with the first element of the unsorted part

     Best case efficiency of O(n^2) when the array is already sorted and worst case (average case) efficiency of O(n^2) when the array is reverse sorted.

    Selection Sort requires two nested for loops to complete itself, one for loop is in the function selectionSort,
    and inside the first loop we are making a call to another function indexOfMinimum, which has the second(inner) for loop.
    Hence for a given input size of n, following will be the time and space complexity for selection sort algorithm:

     */


    public static void selectionSort(int[] someArray){

        for (int i = 0; i < someArray.length - 1; i++)
        { int minValue = i;
             for (int j = i + 1; j < someArray.length; j++) {
                 if (j < i) {
                     i = minValue;
                 }
                 //moving the smallest value to the current i position of the array:
                 int temp = i;
                 i = minValue;
                 minValue = temp;
             }
        }
    }
}
