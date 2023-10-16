package Recursion;

import java.util.Scanner;

public class AlternateSumSeries {
    public static int alternateSumFind(int num){
        //1.BAse case condition
        if(num==0){
            return 0;
        }

        //2.recursive function call
        //num is even
        if(num%2==0){
            return alternateSumFind(num-1)-num;
        }
        //num is odd
        else{
            return alternateSumFind(num-1)+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();

        //function calling
        int result=alternateSumFind(num);
        System.out.println("The alternate sum series is :"+result);
    }
}
