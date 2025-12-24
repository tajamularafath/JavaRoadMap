package collections.set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {
    public static void main(String[] args) {

        ///  HashSet
        /// ✅ HashSet rules: - Does not allow duplicates.
        ///                   - Allows one null element.
        ///                   - Does not preserve insertion order.

        HashSet st = new HashSet();

        st.add(10);
        st.add("String");
        st.add(null);
        st.add(10);
        st.add(10.10);

        System.out.println("HashSet => "+st);

        System.out.println();

        ///  LinkedHashSet
        /// ✅ HashSet rules: - Does not allow duplicates.
        ///                   - Allows one null element.
        ///                   - "Preserves insertion order."
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add("String");
        lhs.add(null);
        lhs.add(10);
        lhs.add("String");
        lhs.add(10.10);
        System.out.println("LinkedHashSet => "+lhs);


        /// TreeSet
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(5);
        System.out.println("TreeSet => "+ts);


    }
}
