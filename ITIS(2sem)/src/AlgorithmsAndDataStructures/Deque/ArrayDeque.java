package AlgorithmsAndDataStructures.Deque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 18.02.2017.
 */
public class ArrayDeque implements Deque {
    private LinkedList deque;

    public ArrayDeque() {
        deque = new LinkedList();
    }

    @Override
    public void pushFront(Object o) {
        deque.add(0, o);
    }

    @Override
    public void pushBack(Object o) {
        deque.add(o);
    }

    @Override
    public Object popFront() {
        Object o = first();
        deque.remove(0);
        return o;
    }

    @Override
    public Object popBack() {
        Object o = last();
        deque.remove(size() - 1);
        return o;
    }

    @Override
    public Object first() {
        return deque.get(0);
    }

    @Override
    public Object last() {
        return deque.get(size() - 1);
    }

    @Override
    public int size() {
        return deque.size();
    }
}
