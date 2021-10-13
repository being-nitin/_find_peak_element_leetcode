package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// peal value in a mountained array:
    }
    static int elementInMountainedArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
