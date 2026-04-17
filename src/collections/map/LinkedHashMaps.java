package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMaps {

    public static void main(String[] args) {

        LinkedHashMap lhm = new LinkedHashMap();

        lhm.put(1,"apple");
        lhm.put(4,"banana");
        lhm.put(2,"pineapple");
        lhm.put(5,"graphs");
        lhm.put(3,"Guava");

        System.out.println(lhm );
        System.out.println(lhm.get(5) );
        System.out.println(lhm.values() );
    }
}
