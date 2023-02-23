package no10_dsa_stack_queue.reverse_array;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reverse array of interger array:
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Enter the length of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element of array at position " + i);
            arr[i] = sc.nextInt();
            myStack.push(arr[i]);
        }

        for (int i = 0; i < size; i++) {
            arr[i] = myStack.pop();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //==================================================================

        // Reverse array of String array:
    }
}
