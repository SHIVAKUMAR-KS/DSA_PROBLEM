package HashMap;
//time complexity:-O(n)
//space complexity- O(n)
import java.util.HashMap;
import java.util.Scanner;

public class firstOccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str=sc.nextLine();

        HashMap<Character,Integer> map=new HashMap<>();

        //construction of a hashtable
        //key -unique character in the string
        //value frequency of each character in the string

        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey((str.charAt(i)))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);

            }else{
                map.put(str.charAt(i),1);
            }
        }

        //SCAN THE ENTIRE HASHTABLE AND GET THE INDEX OF THE NON-REPEATING CHAR
        int result=-1;
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i))==1){
                System.out.println("The first non-repeating character index is :"+i);
                result=1;
                break;
            }
        }
        if(result==-1){
            System.out.println("No non-repeating character present in the string");
        }
    }
}
