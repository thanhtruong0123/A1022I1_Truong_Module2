package no9_dsa_arraylist.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList newLinkedList = new MyLinkedList();

        newLinkedList.addFirst("a");
        newLinkedList.add(1,"b");
        newLinkedList.addLast("c");

        newLinkedList.remove(1);
        newLinkedList.remove("a");

        for (int i = 0; i < newLinkedList.size(); i++) {
            System.out.println(newLinkedList.get(i));
        }
    }
}
