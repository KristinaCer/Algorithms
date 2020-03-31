package com.algorithms;

public class Main {

    private static int [] intArrray = new int[]{1, 5, 10, 0, 15};
    private static final int INT_OF_INTEREST = 15;

    public static void main(String[] args) {

        LinearSearch.linearSearch(intArrray, INT_OF_INTEREST);
        BinarySearch.binarySearch(intArrray, INT_OF_INTEREST);
    }
}
