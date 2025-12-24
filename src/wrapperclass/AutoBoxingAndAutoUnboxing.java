package wrapperclass;

import java.util.ArrayList;

public class AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {

        /// A wrapper class is a class that converts a primitive data type into an object,
        /// So it can be used where objects are required (like collections).

        Integer x = 10;  // autoBoxing
        Integer y = 20;  // autoBoxing

        int sum = x + y; // autoUnboxing

        System.out.println(sum); // 30


        System.out.println("==============");

        ArrayList arr = new ArrayList();
        arr.add(x);  /// Internally it will autoboxing arr.add(Integer.valueOf(x));
        arr.add(y);  /// Internally it will autoboxing arr.add(Integer.valueOf(y));
        System.out.println(arr); // 30

    }
}
