public class Palindrome {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 2, 1};
        int n = arr.length;


        /// logic
//        i=0 -- arr[0]=1 which is  equal to arr[5-0-1]=arr[4]=1
//
//        i=1 -- arr[1]=2 which is  equal to arr[5-1-1]=arr[3]=2
//
//        i=2 -- arr[2]=4 which is  equal to arr[5-2-1]=arr[2]=4
//
//        i=3 -- arr[3]=2 which is  equal to arr[5-3-1]=arr[1]=2
//
//        i=4 -- arr[4]=1 which is  equal to arr[5-4-1]=arr[0]=1
//                then after that loop will end
//
//        

        for (int i=0; i<n; i++){
            if(arr[i] !=arr[n - i - 1]){
                System.out.println("Given integer is not palindrome");
                break;
            }
        }
        System.out.println("Given integer is palindrome");


    }

}