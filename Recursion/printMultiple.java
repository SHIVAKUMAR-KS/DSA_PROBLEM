package Recursion;

public class printMultiple {
    //function defintion
    public static void printMult(int n,int k){
        //1.base condition
        if(k==1){
            System.out.println(n);
            return;
        }

        //2.recursive function calls
        printMult(n,k-1);
        System.out.println(n*k);

    }

    //Driver code
    public static void main(String[] args) {
        int n=2;
        int k=15;
        printMult(n,k);
        System.out.println();
    }
}
