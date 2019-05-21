package chapter4_quicksort;

import java.util.Arrays;

public class RecursiveMax {
    private static int max(int[] list) {
        if (list.length == 1) {
            return list[0];
        } else if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        } else {
            int max = max(Arrays.copyOfRange(list, 1, list.length));
            return list[0] > max ? list[0] : max;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 5, 10, 25, 16, 1})); // 25
    }
}
