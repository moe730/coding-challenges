package com.oop;

public class Driver {

    // main method
    public static void main(String[] args) {
        Store cookieShop = new Store("cookies",33,3.75); // Constructors
        Store newStore = new Store();

        int nums[] = {1,19,22,100,-2,2,44,-92,33,1,0,9};

        newStore.findSmallest(nums);
        //System.err.println("please fix program");



        System.out.println(cookieShop.inventoryCount);

        System.out.println(newStore.inventoryCount);
    }
}

