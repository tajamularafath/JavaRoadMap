package collections.list;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        /* ArrayList
           => P D C                                                        * Insertion Order
           => java.util                                                    * Duplicates Allowed
           => JDK 1.2                                                      * Indexed Based
           => Initial Capacity is 10                                       * Null can be inserted
           => Increment Capacity is (Current Capacity/2 * 3) + 1
           => Underlined DS "Growable Array" */

        ArrayList l = new ArrayList();

        l.add(10);
        l.add(10.0);
        l.add("Hello");
        l.add(null);
        l.add(0);
        l.add(null);

        System.out.println(l);
        System.out.println("===========================");
        System.out.println(l.isEmpty());
        System.out.println("===========================");
        System.out.println(l.size());
        System.out.println("===========================");
        System.out.println(l.contains("Hello"));
        System.out.println("===========================");
        System.out.println(l.get(3 ));
        System.out.println("===========================");
        System.out.println(l.remove(3 ));
        System.out.println("===========================");
//        l.clear();
        System.out.println("===========================");
        System.out.println(l.indexOf(0));
        System.out.println("===========================");
        System.out.println(l.remove(3 ));
        System.out.println("===========================");
    }
}
