package no10_dsa_stack_queue.coverse_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();

        System.out.println("Enter a Decimal number");
        int decimal = sc.nextInt();

        int remainder;

        while (decimal != 0) {
            remainder = decimal%2;
            myStack.push(remainder);
            decimal = decimal/2;
        }

        while (!myStack.empty()) {
            System.out.print(myStack.pop());
        }
    }
}
