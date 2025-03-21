package Array;

import java.util.Scanner;

public class ReverseStr {

    public static String reverseString(String str){
        char[] charArray =str.toCharArray();
        int left=0;
        int right= charArray.length-1;

        while(left<right){
            char temp=charArray[left];
            charArray[left] =charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }

        return  new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input =sc.nextLine();


        String reversed =reverseString(input);
        sc.close();
        System.out.println("Reversed string is :"+reversed);
    }
}
