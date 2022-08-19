package com.oop;

public class Store {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;


    public Store() {
        System.out.println("you opened the store ");
    }

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
        System.out.println(price);
        System.out.println("i am the overloaded method");
    }

    //{22,19,2,-1,90,3,-4,18}

    public int findSmallest(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        int smallest = nums[0];


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < smallest) {
                smallest = nums[i];
            }

        }
        System.out.println(smallest);
        return smallest;
    }

}

