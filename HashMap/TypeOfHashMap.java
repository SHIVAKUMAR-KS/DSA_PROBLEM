package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TypeOfHashMap {
    public static void main(String[] args) {

        //unordered return type
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3,"shiva");
        map.put(1,"Ashan");
        map.put(7,"Aryan");
        map.put(5,"jeet");

        System.out.println("HashMap class map looks like:"+map);

        //Order of insertion retained in LinkedHashMAp
        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(3,"shiva");
        map1.put(1,"Ashan");
        map1.put(7,"Aryan");
        map1.put(5,"jeet");

        System.out.println("LinkedHashMap class map looks like:"+map1);


        //sorted output on the basis of the key

        TreeMap<Integer,String> map2=new TreeMap<>();
        map2.put(3,"shiva");
        map2.put(1,"Ashan");
        map2.put(7,"Aryan");
        map2.put(5,"jeet");
        map2.put(6,"ayush");

        System.out.println("TreeMap class map looks like:"+map2);

    }
}
