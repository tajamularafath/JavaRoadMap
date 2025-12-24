package collections.list;

import java.util.Vector;

public class Vectorss {

    public static void main(String[] args) {

        ///  Vector is a legacy Java class that implements a dynamic array, similar to ArrayList, but it is synchronized (thread-safe).
        ///  Initial increment capacity 10
        ///  Incremental capacity currentCapacity * 2

        Vector vr = new Vector();

        vr.add("Hello");
        vr.add("Java");

        System.out.println(vr);
    }
}
