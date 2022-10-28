package com.algorithims;

public class Quicksort {

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
}
