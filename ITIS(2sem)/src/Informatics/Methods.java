package Informatics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by User on 05.03.2017.
 */
public interface Methods {
    Set intersect(Set a, Set b);

    Set union(Set a, Set b);

    Set substraction(Set a, Set b);
}

class SetOperations implements Methods {
    @Override
    public Set intersect(Set a, Set b) {
        Set set = new HashSet();
        for (Object o : a) {
            if (b.contains(o)) {
                set.add(o);
            }
        }
        return set;
    }

    @Override
    public Set union(Set a, Set b) {
        for (Object o : b) {
            if (!a.contains(b)) {
                a.add(o);
            }
        }
        return a;
    }

    @Override
    public Set substraction(Set a, Set b) {
        Set set = new HashSet();
        for (Object o : a) {
            if (!b.contains(o)) {
                set.add(o);
            }
        }
        return set;
    }
}
