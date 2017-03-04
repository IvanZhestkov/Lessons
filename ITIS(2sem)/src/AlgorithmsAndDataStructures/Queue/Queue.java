package AlgorithmsAndDataStructures.Queue;

/**
 * Created by User on 14.02.2017.
 */
public interface Queue {
    void push(Object o);
    Object first();
    Object pop();
    int size();
    boolean isEmty();
    Object min();
}
