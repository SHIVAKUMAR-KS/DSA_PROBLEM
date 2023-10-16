package Array;

import java.util.Scanner;

public class Reverse {
   // public static void main(String[] args) {
//        int arr[]={2,4,6,8,10};
//        int n=5;
//        for (int i = 0; i < n / 2; i++) {
//            int temp =arr[i];
//            arr[i]=arr[n-i-1];
//            arr[n-i-1]=temp;
//        }
//        System.out.println("Reversed array is :");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]+" ");
//        }
   // }


    ///user-defined input
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the nuber of element:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the element in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n / 2; i++) {
            int temp =arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed array is :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }

    }
}
