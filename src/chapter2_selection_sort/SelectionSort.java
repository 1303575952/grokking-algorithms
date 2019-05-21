package chapter2_selection_sort;

import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int[] arr) {
        int[] sortedArr = arr;
        for (int i = 0; i < arr.length; i++) {
            sortedArr = swap(sortedArr, i, findSmallest(arr, i));
        }
        return sortedArr;
    }

    private static int findSmallest(int[] arr, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(selectionSort(arr))); // [2, 3, 5, 6, 10]
    }
}
