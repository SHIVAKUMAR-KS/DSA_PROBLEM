package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int  factorialFind(int n){

        int result=0;
        if(n==0 || n==1){
            return 1;
        }else{
            result =n*factorialFind(n-1);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial:");
        int n =sc.nextInt();


        //function calling
        int result=factorialFind(n);
        System.out.println("Factorial of a given number is "+result);




    }
}
