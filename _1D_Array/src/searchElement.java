package Array;

import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is not present in the array.");
        }
    }
}
