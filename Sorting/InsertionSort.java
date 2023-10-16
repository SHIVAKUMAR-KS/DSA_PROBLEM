package Sorting;
//time complexity: O(n^2)

import java.util.Arrays;
import java.util.*;

public class InsertionSort {

    public static  void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                //swap the element between arr[j] and arr[j-1]
                int temp=arr[j];
                arr[j] =arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={20,50,67,79,12,15};

        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is :");
        System.out.println(Arrays.toString(arr));
    }
}
