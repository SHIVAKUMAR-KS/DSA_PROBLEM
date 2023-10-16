package Searching;
//Approach :Modified Binary Search
//Time complexity : O(log n)
//Space complexity : O(1)

import java.util.Scanner;
import java.util.*;

public class SquareRoot {
    public  static int findSquareRoot(int num){
        int low=0;
        int high=num;
        int result=-1;

        //modified binary search
        while(low<=high){
            int mid=low + (high-low)/2;
            long val =mid*mid;

            if(val==num){
                //perfect square root
                return mid;
                } else if (val<num){
                    //store the floor  value ,incase the number is not perfect square root,we can prnt the floor value
                    result =mid;
                    low=mid+1;


                }else {
                high = mid - 1;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want teh square root:");
        int num=sc.nextInt();

        //function calling
        int result =findSquareRoot(num);
        System.out.println("Square root of given number is :"+result);
    }
}
