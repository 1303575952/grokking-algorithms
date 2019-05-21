package chapter4_quicksort;

import java.util.Arrays;

public class Quicksort {

    private static void quicksort(int[] arr) {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
    }

    public static void quickSort(int[] data, int start, int end) {
        if (data == null || start >= end) return;
        int i = start, j = end;
        int pivotKey = data[start];
        while (i < j) {
            while (i < j && data[j] >= pivotKey) j--;
            if (i < j) data[i++] = data[j];
            while (i < j && data[i] <= pivotKey) i++;
            if (i < j) data[j--] = data[i];
        }
        data[i] = pivotKey;
        quickSort(data, start, i - 1);
        quickSort(data, i + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3};
        quicksort(arr);
        System.out.println(Arrays.toString(arr)); // [2, 3, 5, 10]
    }
}
