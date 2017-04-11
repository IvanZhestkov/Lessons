package AlgorithmsAndDataStructures;

import java.util.List;

/**
 * Created by User on 05.03.2017.
 */
public class HeapSort {
    private static int heapSize;

    public static void sort(List<Integer> a) {
        heapMake(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            heapify(a, 0);
        }
    }

    private static void heapMake(List<Integer> a) {
        heapSize = a.size();
        for (int i = a.size() / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    private static void heapify(List<Integer> a, int i) {
        int left = left(i);
        int right = right(i);
        /*int max = i;
        if (left < heapSize && a[i] < a[left]) {
            max = left;
        }
        if (right < heapSize && a[max] < a[right]) {
            max = right;
        }
        if (i != max) {
            swap(a, i, max);
            heapify(a, max);
        }*/

        int min = i;
        if (left < heapSize && a.get(i) < a.get(left)) {
            min = left;
        }
        if (right < heapSize && a.get(min) < a.get(right)) {
            min = right;
        }
        if (i != min) {
            swap(a, i, min);
            heapify(a, min);
        }
    }

    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    private static void swap(List<Integer> arr, int a, int b) {
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }
}
