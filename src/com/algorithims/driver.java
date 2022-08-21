package com.algorithims;

import java.util.Random;

public class driver {

    public static void main(String[] args) {
        Algorithims algo = new Algorithims();
   /*     int []nums= {-2,1,-3,4,-1,2,1,-5,4};
        algo.printArray(nums);
        algo.maxSubArray(nums);
        algo.findSmallest(nums);*/

        //create a random number generator
        Random rand = new Random();
        int [] array = new int[10];
        for (int i=0; i<array.length; i++){
            array[i]= rand.nextInt(1000 +10);
            //array[i]= rand.nextInt(1000 +10)-500;
        }
      /*  System.out.println("before:");
        algo.printArray(array);

        algo.quickSort(array,0,array.length-1);
        System.out.println("\nAfter:");
        algo.printArray(array);*/

        //algo.isUnique("hell");
        //algo.messingSet("clue");
        //algo.messingHashMap();
        //int[] arr = {10,20,30,40,-60};

        algo.returnArray(array);


    }
}
