package com.dsa.chapter2.TestTimes;

public class Search {


    public int linearSearch(int[] array, int target) {

        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == target) {
                //finds the number in the array
                System.out.println("found your number "+target);
                return i;
            } else if (array[i] > target)

            {    // this else clause is only valid if we know that the array is already sorted
                System.out.println("array is already sorted ");
                return -1;
            }
        }
        System.out.println("number "  +target+" does not exist in the array ");
        return -1;
    }


    public int binarySearch(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        int middle;

        while (first <= last) {
            middle = (first + last) / 2;

            if (array[middle] == target) {
                System.out.println("your target is "+target);
                return middle;
            } else if (target < array[middle]) {
                last = middle - 1;
            } else{
                first = middle + 1;
            }
        }
        System.out.println("target does not exist in array ");
        return -1;
    }


    int recursiveBS(int[] array, int target, int first, int last) {
        if (first > last) {
            System.out.println("first can not be greater than last ");
            return -1;
        }

        int middle = (first + last) / 2;

        if (array[middle] == target) {
            System.out.println("your target is "+target);
            return middle;
        } else if (target < array[middle]) {
            return recursiveBS(array, target, first, middle - 1);
        } else{

            return recursiveBS(array, target, middle + 1, last);
        }
    }
}

