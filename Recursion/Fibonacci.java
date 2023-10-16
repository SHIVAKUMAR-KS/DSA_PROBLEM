package Recursion;

import java.util.Scanner;

public class Fibonacci {
    //function definition
    public static int fibonacciFind(int n){
        int result=0;

        //Base case condition
        if(n<=1){
            return n;
            //Recursive function call
        }else{
            result =fibonacciFind(n-1) + fibonacciFind(n-2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to finding the fiboncci series:");
        int n=sc.nextInt();

        //fuction caliing
        int result=fibonacciFind(n);
        System.out.println("The final output is :"+result);
    }
}
