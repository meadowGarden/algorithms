package recursion;

import java.util.Arrays;

public class Rec04 {

    public static void main(String[] args) {
        int[] arr = new int[] {10, 5, 2, 3};
        System.out.printf("before sorting %s%n", Arrays.toString(arr));
        quickSort(arr);
        System.out.printf("after sorting %s%n", Arrays.toString(arr));
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int pivot = arr[0];

        }
    }
}
