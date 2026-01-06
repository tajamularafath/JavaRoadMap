package collections.set.treeset;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>{

        int id;
        String name;
        int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.id + " "+ this.name+ " "+ this.age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}
