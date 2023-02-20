package no9_dsa_arraylist.array_list;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList () {
    }

    public MyList(int capacity) {
    }

    public void add(int index, E element) {
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                elements[i+1] = elements[i];
                i++;
            }
            elements[i] = element;
            size++;
        }
    }

    public E remove(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                elements[i-1] = elements[i];
                i++;
            }
            size--;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public E clone() {
        return null;
    }

    public boolean contains(E o) {
        boolean isTrue = false;
        for (Object element : elements) {
            if (element == o) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                System.out.println(i);
                index = i;
                break;
            }
        }
        return index;
    }

//    public boolean add(E e) {
//    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

//    public E get(int i) {
//    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = 0;
        }
        size = 0;
    }
}
