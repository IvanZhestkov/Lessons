package AlgorithmsAndDataStructures.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 14.02.2017.
 */
public class ArrayQueue implements Queue {
    private LinkedList queue;

    public ArrayQueue(int capasity) {
        queue = new LinkedList();
    }

    @Override
    public void push(Object o) {
        queue.add(o);
    }

    @Override
    public Object first() {
        return queue.get(0);
    }

    @Override
    public Object pop() {
        Object temp = first();
        queue.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmty() {
        return size() == 0;
    }

    @Override
    public Object min() {
        return null;
    }
}
