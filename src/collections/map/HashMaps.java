package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
//        Map mp = new Map();
        hm.put(1,"apple");
        hm.put(4,"banana");
        hm.put(2,"pineapple");
        hm.put(5,"graphs");
        hm.put(3,"Guava");

        System.out.println(hm );
        System.out.println(hm.get(5) );
        System.out.println(hm.values() );
        System.out.println(hm.remove(5) );
        System.out.println(hm );
    }
}
