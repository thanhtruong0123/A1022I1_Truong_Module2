package no9_dsa_arraylist.linked_list;

public class MyLinkedList <E> {
    private class Node {
        private E element;
        private Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setData(E element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element, temp);
        size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        } else if (index == 0) {
            addFirst(element);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(element, current.next);
            current.next = newNode;
            size++;
        }
    }

    public boolean addLast(E element) {
        boolean result = false;
        if (size == 0) {
            addFirst(element);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(element, null);
            current.next = newNode;
            size++;
            result = true;
        }
        return result;
    }

    public int size() {
        return size;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.element;
    }
}
