package Recursion;

import java.util.Scanner;
import java.util.*;

public class countWays {
    //function definition
    public static int countNUm(int n){
        int result=0;
        //BAse condition
         if(n<=1){
             return n;
         }
         //recursive condition
        else{
            result =countNUm(n-1)+countNUm(n-2);
         }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of stairs:");
        int n=sc.nextInt();

        //function calling
        //relationship beteeen count of stairs and fibbonacci
        int result=countNUm(n+1);
        System.out.println("The Number of ways is : "+result);
    }
}
