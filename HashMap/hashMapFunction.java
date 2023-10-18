package HashMap;
/*put()
These are the HashMap function
get()
remove()
entrySet()
containsKey()


 # output:
  HashMap of the given data is :{1=Shiva, 3=Asha, 5=Karan, 8=Astha}
Value for the given key is :Asha
false
Updated hashMap :{3=Asha, 5=Karan, 8=Astha}
HashMap is :
3:Asha
HashMap is :
5:Karan
HashMap is :
8:Astha

 */
import java.util.HashMap;
import java.util.*;

public class hashMapFunction {
    public static void main(String[] args) {
        //creation of HashMap
        HashMap<Integer,String>hashMap=new HashMap<>();

        hashMap.put(1,"Shiva");
        hashMap.put(3,"Asha");
        hashMap.put(5,"Karan");
        hashMap.put(8,"Astha");

        System.out.println("HashMap of the given data is :"+hashMap);

        //functionality of the get() function
        String result=hashMap.get(3);
        System.out.println("Value for the given key is :"+result);

        //functionality of the containKey() function
        System.out.println(hashMap.containsKey(2));

        //functionality of the remove() function
        hashMap.remove(1);
        System.out.println("Updated hashMap :"+hashMap);

        //iterating using the for loop
        for(Map.Entry<Integer,String>e:hashMap.entrySet()){
            System.out.println("HashMap is :");
            System.out.println(e.getKey() +":"+e.getValue());
        }

    }
}
