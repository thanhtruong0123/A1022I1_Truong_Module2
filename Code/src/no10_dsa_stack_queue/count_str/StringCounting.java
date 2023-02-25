package no10_dsa_stack_queue.count_str;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a document to count word");
        String document = sc.nextLine();

        String[] arr = document.split(" ");

        Map<String, Integer> myMap = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            int count = 0;

            for (String element : arr) {
                if (element.equals(word)) {
                    count++;
                }
                myMap.put(word, count);
            }
        }

        for (String key: myMap.keySet()) {
            System.out.println(key + " : " + myMap.get(key) + " time(s)");
        }
    }
}
