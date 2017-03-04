package AlgorithmsAndDataStructures.Queue;

import AlgorithmsAndDataStructures.Stack.ArrayStackMin;
import AlgorithmsAndDataStructures.Stack.Stack;

/**
 * Created by User on 04.03.2017.
 */
public class ArrayQueueMin implements Queue {
    private Stack a;
    private Stack b;
    private boolean flag;

    public ArrayQueueMin() {
        a = new ArrayStackMin();
        b = new ArrayStackMin();
    }

    @Override
    public void push(Object o) {
        a.push(o);
        flag = true;
    }

    @Override
    public Object first() {
        if (b.size() == 0) {
            while (a.size() > 0) {
                b.push(a.pop());
            }
        }
        flag = false;
        return b.top();
    }

    @Override
    public Object pop() {
        while (a.size() > 0) {
            b.push(a.pop());
        }
        flag = false;
        return b.pop();
    }

    @Override
    public int size() {
        return b.size();
    }

    @Override
    public boolean isEmty() {
        return b.size() == 0;
    }

    @Override
    public Object min() {
        return flag ? a.min() : b.min();
    }
}
