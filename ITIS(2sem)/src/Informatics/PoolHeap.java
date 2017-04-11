package Informatics;

import AlgorithmsAndDataStructures.HeapSort;

import java.util.*;

/**
 * Created by User on 13.03.2017.
 */
public class PoolHeap {

    static private Heap heap = new Heap();
    static private Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != 0){
            if (x == 1) {
                System.out.println(getMinBall2());
            }
            if (x!=1) set.add(x);
            x = sc.nextInt();
        }
    }

    public static void putBall(int value) {
        heap.add(value);
    }

    public static int getMinBall() {
        return heap.min();
    }

    public static int getMinBall2() {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int index = iterator.next();
            iterator.remove();
            return index;
        }
        return 0;
    }
}
