package Informatics;

import java.util.*;

/**
 * Created by User on 05.03.2017.
 */

class SetOperations {
    public static <T> Set<T> intersect(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>();
        for (Object o : a) {
            if (b.contains(o)) {
                set.add((T) o);
            }
        }
        return set;
    }

    public static <T> Set<? extends T> union(Set<? extends T> a, Set<? extends T> b) {
        Set<T> set = new HashSet<>(a);
        for (Object o : b) {
            if (!set.contains(b)) {
                set.add((T) o);
            }
        }
        return set;
    }

    public static <T> Set<T> substraction(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>();
        for (Object o : a) {
            if (!b.contains(o)) {
                set.add((T) o);
            }
        }
        return set;
    }
}

class Test {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(2);
        s1.add(4);
        s1.add(7);
        s1.add(0);

        s2.add(2);
        s2.add(4);
        s2.add(5);
        s2.add(5);
        Set s = SetOperations.union(s1, s2);
        System.out.println(s.toString());
    }
}
