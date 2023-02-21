package no9_dsa_arraylist.array_list;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size);
        }

        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            elements[index] = element;
            size++;
        } else {
            Object[] cloneElements = elements.clone();

            for (int i = index+1; i < size; i++) {
                elements[i] = cloneElements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index <= 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            elements[index] = null;
            size--;
        } else {
            Object[] cloneElements = elements.clone();

            for (int i = index; i < size; i++) {
                elements[i] = cloneElements[i+1];
                size--;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

//    public E clone() {}

    public boolean contains (E o) {
        boolean result = false;

        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                result = true;
                break;
            }
        }

        return result;
    }

    public int indexOf(E o) {
        int result = -1;

        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                result = i;
                break;
            }
        }

        return result;
    }

//    public boolean add(E element) {
//    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity == elements.length) {
            Object[] newElements = Arrays.copyOf(elements,elements.length* 2);
            elements = newElements;
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }
}
