package chapter1_introduction_to_algorithms;

public class BinarySearch {
    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (list[mid] > item) {
                high = mid - 1;
            } else if (list[mid] < item) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); // 1
        System.out.println(binarySearch(myList, -1)); // null
    }
}
