package recursion;

import java.util.Arrays;

public class Rec04_02 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 3, 9, 4, 1};
        System.out.printf("before sorting %s%n", Arrays.toString(arr));
        Rec04_02 rec =new Rec04_02();
        rec.quickSort(arr, 0, arr.length - 1);
        System.out.printf("after sorting %s%n", Arrays.toString(arr));
    }

    private void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
