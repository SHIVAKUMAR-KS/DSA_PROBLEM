package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of element present in array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];

        //print the array element
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element");
        int x =sc.nextInt();

        ///implimentation of linear search
        int idx =-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                idx=i;
                break;
            }
        }if(idx ==-1){
            System.out.println("Searched element is not found in array");
        }else{
            System.out.println("searched element is found at the location:"+idx);
        }
    }
}
