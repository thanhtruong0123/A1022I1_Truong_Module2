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
        if (head == null) {
            return false;
        } else if (head.element.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.element.equals(e)) {
                    current.next = current.next.next;
                    result = true;
                    break;
                }
                current = current.next;
            }
            numNodes--;
            return result;
        }
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            cloneList.addLast(current.element);
            current = current.next;
        }
        return cloneList;
    }

    public boolean contains(E o) {
        boolean result = false;
        Node current = head;
        while (current != null) {
            if (current.element.equals(o)) {
                result = true;
                break;
            }
            current = current.next;
        }
        return result;
    }
}
