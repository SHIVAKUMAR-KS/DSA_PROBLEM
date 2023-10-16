package Recursion;

public class sumDigit {
    //function calling
    public static int sumofDigit(int num){
        //Base case condition
        if(num==0){
            return 0;
        }
        //Recursive function call
        return (num%10)+sumofDigit(num/10);
    }
    public static void main(String[] args) {
        int num=123456;
        int result =sumofDigit(num);
        System.out.println("The sum of the given digits is :"+result);
    }
}
