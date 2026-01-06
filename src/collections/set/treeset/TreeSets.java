package collections.set.treeset;

import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        TreeSet t = new TreeSet();
        t.add("hello");
        t.add("bye");
        t.add("Hello");
        t.add("lulu");

        for (Object t1: t){
            System.out.println(t1);
        }

        User u1 = new User(1,"Umar ", 10);
        User u2 = new User(3,"Ali ", 11);
        User u3 = new User(2,"Musud ", 8);

        TreeSet<User> user = new TreeSet<User>();

        user.add(u1);
        user.add(u2);
        user.add(u3);

        for (User u:user){
            System.out.println("User "+u);
        }
    }
}
