package com.algorithims;

import java.util.HashSet;
import java.util.Random;

public class Algorithims {
    //doing some array algorithims

    // private  int [] array = new int[50];
    //private  int arraySize = 10;

//    public void generateRandomArray(){
//        for (int i = 0; i <arraySize ; i++) {
//            array[i] = (int) (Math.random()*10)+10;
//        }
//    }
//
    public void printArray(int[] nums){
        for (int i=0; i<nums.length; i++){
            System.out.print(" "+nums[i]+ " ");
        }
    }

    //greedy algo
    public int maxSubArray(int[] nums) {

        //check if array is empty
        if (nums.length == 0) {
            return 0;
        }

        int maxSub = nums[0];
        //this will make sure it will be a positve number or largest sum
        int currSum = Math.max(0,maxSub);

        for (int i=1; i< nums.length; i++) {
           currSum += nums[i];
           maxSub = Math.max(currSum,maxSub);
           if (currSum < 0) {
               currSum = 0;
           }
        }
        System.out.println(maxSub);
        return maxSub;
    }


    //find the smallest
    public int findSmallest(int[] nums) {
        if(nums.length == 0) {
            return - 1;
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


/*quicksort method takes in an array
*   takes a low index which will be 0 index for the first index
*   takes a high index which will be nums.length-1 for the last index*/

public void quickSort(int[] nums, int lowIndex, int highIndex){
   //quicksort array
    //pivot point is the last index aka high index

    //this is the case to sort one element
    if(lowIndex >= highIndex){
        return;
    }
    /*
    use this for a random pick of pivot
    int pivotIndex = new Random().nextInt(highIndex-lowIndex)+lowIndex;
    int pivot = nums[pivotIndex];
    swap(nums,pivotIndex,highIndex);
    */

    int pivot = nums[highIndex];

    //partition setting based on pivot have two pointers

    int left = lowIndex;
    int right = highIndex;

    //left needs to be less than right
   while (left<right){
        //index left is less than or equal to pivot and left is less than right
       while (nums[left]<= pivot && left < right){
           left++;
       }
       //right is greater than pivot and left is less than right
       while (nums[right] >= pivot && left < right){
           right --;
       }
       //this sawp elements that are on the left and right
       swap(nums,left,right);
   }
   //once the left and right are equal we do another swap
   swap(nums,left,highIndex);

    //using reccursion

    //calls quicksort for the left side
    quickSort(nums,lowIndex,left -1);
    //calls quicksort for the right side
    quickSort(nums,left+1,highIndex);


}
//this is my helper method of swapping
    public void swap(int[] arr, int index0, int index1){
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;

    }

    //overloading the method of quicksort to take in an array
    public void quickSort(int[] array){
     quickSort(array,0,array.length-1);

    }

    public boolean isUnique (String input){

    char [] wordarray = input.toCharArray();

        HashSet<Character> set = new <Character> HashSet();

        for (int i = 0; i < wordarray.length ; i++) {
            if (set.contains(wordarray[i])){
                System.out.println("duplicate found");
                return false;
            }else {
                System.out.println("start comparing");
                set.add(wordarray[i]);
            }

        }

        System.out.println("congrats your word is not a duplicate");
    return true;

    }


}
