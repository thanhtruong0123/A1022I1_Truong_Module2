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

        public void setElement(E element) {
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
    private int numNodes;

    public MyLinkedList() {
        numNodes = 0;
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element, temp);
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
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
            numNodes++;
        }
    }

    public boolean addLast(E element) {
        boolean result = false;
        if (numNodes == 0) {
            addFirst(element);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(element, null);
            current.next = newNode;
            numNodes++;
            result = true;
        }
        return result;
    }

    public int size() {
        return numNodes;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.element;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E removedValue = current.next.element;
        current.next = current.next.next;
        numNodes--;
        return removedValue;
    }

    public boolean remove(Object e) {
        boolean result = false;
        Node current = head;
        while (current.next != null) {
            if (current.next.element == e) {
                current.next = current.next.next;
                result = true;
            }
        }
        numNodes--;
        return result;
    }
}
