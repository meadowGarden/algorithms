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
            int lessCount = 0;
            int greaterCount = 0;

            for (int n = 1; n < arr.length; n++) {
                if (arr[n] <= pivot) {
                    lessCount++;
                } else {
                    greaterCount++;
                }
            }

            int[] lessArr = new int[lessCount];
            int takenLessIndex = 0;
            int[] greaterArr = new int[greaterCount];
            int takenGreaterIndex = 0;

            for (int n = 1; n < arr.length; n++) {
                if (arr[n] <= pivot) {
                    lessArr[takenLessIndex] = arr[n];
                    takenLessIndex++;
                }

                if (arr[n] > pivot) {
                    greaterArr[takenGreaterIndex] = arr[n];
                    takenGreaterIndex++;
                }
            }

            lessArr = quickSort(lessArr);
            greaterArr = quickSort(greaterArr);

            int addIndex = 0;
            for (int i = addIndex; i < lessArr.length; i++) {
                arr[i] = lessArr[addIndex];
                addIndex++;
            }
            addIndex = (lessArr.length > 0) ? lessArr.length - 1 : lessArr.length;

            arr[addIndex] = pivot;
            addIndex++;

            for (int i = addIndex; i < greaterArr.length; i++) {
                arr[i] = greaterArr[addIndex];
                addIndex++;
            }

            return arr;
        }
    }
}
