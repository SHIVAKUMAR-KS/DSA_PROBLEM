package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //size of the array
        System.out.println("Enter the size of an array");
        int n =sc.nextInt();

        //input array element in an array
        int arr[] =new int[n];
        System.out.println("Enter the array element");

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //input target element in an array
        System.out.println("Enter the target element in an array");
        int target=sc.nextInt();

        //create a hashmap where key is arr[i] and value is i
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        //create a result array to display  the index of teh two number
        int result[] =new int[2];
        //if current is equal to the target
        //main logic of two sum problem
        for (int i=0;i<n;i++){
            if(arr[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1] =map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i])){
                //is the elemnt non-predictable
                if(map.get(target-arr[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        //display the final result
        System.out.println("Two sum index values are :["+result[0]+","+result[1]+"]");
        }
    }