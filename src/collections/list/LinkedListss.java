package collections.list;

import java.util.LinkedList;

public class LinkedListss {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add(10);
        l.add(10.0);
        l.add("LinkedList");
        l.add(null);
        l.add(0);
        l.add(null);

        System.out.println(l);
        System.out.println("===========================");

        int[] arr = {10, 20, 30, 2, 5, 8, 4};
        System.out.println("Array Length " + arr.length);
        System.out.println("===========================");

        String str = "Helo World!";
        System.out.println("String Length " + str.length());
        System.out.println("===========================");

        LinkedList l2 = new LinkedList();
        l2.add("Java");
        l2.add("Hello");
        l2.add(2);
        l2.add(null);
        System.out.println("LinkedList Length " + l2.size());
        System.out.println("===========================");

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        System.out.println("===========================");

        for (int i = l.size() - 1; i > 0; i--) {
            System.out.print(l.get(i) + " ");
        }

        System.out.println("===========================");

        l2.addAll(l);

        System.out.println("Add All Methods l and l2 " + l2);

        System.out.println("Contains => " + l2.contains(l));

        System.out.println("===========================");

//        String[] arr1 = {"Hello", "World", "Hello"};
//        String[] result = new String[10];
//        for (int k = 0; k <= arr1.length -1 ; k++) {
//            if (arr1[k] == arr1[k + 1 ]) {
//                result[k] = arr1[k];
//            }
//
//        }
//        for (int k = 0; k <= arr1.length -1; k++) {
//            System.out.println(result[k]);
//
//        }
    }
}
