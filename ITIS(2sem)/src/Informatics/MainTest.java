package Informatics;

import java.util.*;

/**
 * Created by User on 21.03.2017.
 */
public class MainTest {
    public static void main(String[] args) {
/*
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];

        Arrays.sort(strs,
                (s1, s2) -> {
                    if (s1.length() == s2.length()) return 0;
                    return (s1.length() - s2.length()) / Math.abs(s1.length() - s2.length());
                }
        );*/
        HeapSortComparable<Integer> heap = new HeapSortComparable<>();
        heap.add(5);
        heap.add(7);
        heap.add(185);
        heap.add(0);
        heap.add(78);
        heap.add(17);
        heap.add(0);
        heap.sort();
        for (int i: heap.getData()) {
            System.out.print(i + " ");
        }
    }
}
