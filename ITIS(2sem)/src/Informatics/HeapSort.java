package Informatics;

/**
 * Created by User on 05.03.2017.
 */
public class HeapSort {
    private static int heapSize;

    public static void sort(int[] a) {
        heapMake(a);
        while (heapSize > 1) {
            swap(a, 0, heapSize - 1);
            heapSize--;
            heapify(a, 0);
        }
    }

    private static void heapMake(int[] a) {
        heapSize = a.length;
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    private static void heapify(int[] a, int i) {
        int left = left(i);
        int right = right(i);
        int max = i;
        if (left < heapSize && a[i] < a[left]) {
            max = left;
        }
        if (right < heapSize && a[max] < a[right]) {
            max = right;
        }
        if (i != max) {
            swap(a, i, max);
            heapify(a, max);
        }
    }

    private static int left(int i) {
        return 2 * i + 1;
    }

    private static int right(int i) {
        return 2 * i + 2;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
