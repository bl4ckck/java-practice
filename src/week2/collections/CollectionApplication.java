package week2.collections;

import java.io.Serializable;
import java.util.*;

public class CollectionApplication {
    public static void main(String[] args) {
//        Map<Integer, String>map=new HashMap<Integer, String>();
//        map.put(1,"test1");
//        map.put(5,"test2");
//        map.put(2,"test3");
//        map.put(6,"test3");


//        for(Map.Entry <Integer, String> m: map.entrySet()) {
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

        List<String> awe = new ArrayList<>();
        Set<String> ea = new HashSet<>();
        ea.add("asd");
        ea.add("ea");
        ea.forEach(System.out::println);


    }
}
