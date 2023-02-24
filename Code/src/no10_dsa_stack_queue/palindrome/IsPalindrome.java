package no10_dsa_stack_queue.palindrome;

import java.util.*;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

        while (true) {
            System.out.println("========================");
            System.out.println("Enter a word");
            String str = sc.nextLine();
            String[] arr = str.split("");

            for (int i = 0; i < arr.length; i++) {
                myStack.push(arr[i]);
                myQueue.add(arr[i]);
            }

            boolean result = true;
            while (!myStack.isEmpty()) {
                if (!myStack.pop().equals(myQueue.poll())) {
                    result = false;
                    break;
                }
            }

            if (result) {
                System.out.println("This is a Palindrome");
            } else {
                System.out.println("This is not a Palindrome");
            }
        }
    }
}
