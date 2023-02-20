package no9_dsa_arraylist.array_list;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(8);
        myList.add(9);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
