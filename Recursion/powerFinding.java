package Recursion;

import java.util.Scanner;

public class powerFinding {
    public static int powerFind(int a,int b){
        int mid=0,result=0,finalResult=0;

        //BAse case condition
        if(b==1){
            return a;
        }
        //recursive function calls
        else{
            mid=b/2;
            result=powerFind(a,mid);
            finalResult=result*result;
            if(b%2==0){
                return finalResult;
            }else{
                return a*finalResult;
            }
        }
    }

    public static void main(String[] args) {
        //Driver code
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();

        //function calling
        int result=powerFind(a,b);
        System.out.println("Power of a^b is : "+result);












    }
}
