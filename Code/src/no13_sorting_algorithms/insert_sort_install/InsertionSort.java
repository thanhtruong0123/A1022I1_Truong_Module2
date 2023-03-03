package no13_sorting_algorithms.insert_sort_install;

public class InsertionSort {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int k = i - 1;
            for (; k >= 0 && arr[k] > temp; k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = temp;
        }
    }
}
