package AlgorithmsAndDataStructures.Queue;

import AlgorithmsAndDataStructures.Stack.ArrayStackMin;
import AlgorithmsAndDataStructures.Stack.Stack;

import java.util.Scanner;

/**
 * Created by User on 14.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        /*Queue queue = new ArrayQueue(10);
        queue.push(5);
        queue.push(4);
        queue.push(2);
        queue.push(10);
        queue.push(105);
        queue.push(65);
        queue.push(24);
        queue.push(0);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue.first() + " " + queue.size());*/

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int n = 3;
    }

    public static void min(int[] a, int n) {
        Stack stack = new ArrayStackMin();
        for (int i = 0; i < a.length; i++) {
            
            System.out.println(stack.min());
            stack.poop();
        }
    }
}
