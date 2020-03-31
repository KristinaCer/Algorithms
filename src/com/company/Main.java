package com.company;

public class Main {

    private static int [] intArrray = new int[]{1, 5, 10, -5, 15};
    private static final int INT_OF_INTEREST = 10;

    public static void main(String[] args) {
        LinearSearch.linearSearch(intArrray, INT_OF_INTEREST);
    }
}
