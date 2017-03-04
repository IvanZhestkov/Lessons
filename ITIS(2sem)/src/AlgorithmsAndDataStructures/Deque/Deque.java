package AlgorithmsAndDataStructures.Deque;

/**
 * Created by User on 14.02.2017.
 */
public interface Deque {
    void pushFront(Object o);
    void pushBack(Object o);
    Object popFront();
    Object popBack();
    Object first();
    Object last();
    int size();
}
