package selfTesting;

public class T01 {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 3, 6, 4, 1, 9, 2, 7, 0, 8};
        printIntArray(arr);
        selectionSort(arr);
        printIntArray(arr);
    }


    public static void selectionSort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }

            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }

    private static void zSelectionSort(int[] arr) {
        if (arr.length <= 2)
            return;

        int tValue;
        for (int j = arr.length; j > 1; j--) {
            for (int i = 1; i < arr.length; i++) {
                if ((arr[i] < arr[i - 1])) {
                    tValue = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tValue;
                }
            }
        }
    }

    public static void printIntArray(int[] arr) {
        for (int i : arr)
            System.out.printf("%d", i);
        System.out.println();
    }
}
