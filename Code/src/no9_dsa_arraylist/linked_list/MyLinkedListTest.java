package no9_dsa_arraylist.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList newLinkedList = new MyLinkedList();

        newLinkedList.addFirst(1);
        newLinkedList.addFirst(12);
        newLinkedList.addFirst(24);

        for (int i = 0; i < newLinkedList.size(); i++) {
            System.out.println(newLinkedList.get(i));
        }
    }
}
