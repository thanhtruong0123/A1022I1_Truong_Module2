package no9_dsa_arraylist.array_list;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();

        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);

        myList.remove(1);

        

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
