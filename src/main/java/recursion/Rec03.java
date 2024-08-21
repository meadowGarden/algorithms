package recursion;

public class Rec03 {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 5, 6, 7, 9, 12};
        int searchElement = 5;
        System.out.printf("array element sum is %d%n", sumArr(arr));
        System.out.printf("array element count is %d%n", countArr(arr));
        System.out.printf("array biggest number is %d%n", maxNumber(arr));
        System.out.printf("%d is in index %d%n", searchElement, binarySearchRec(searchElement, arr, 0, arr.length - 1));
    }

    public static int sumArr(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int restArrLength = arr.length - 1;
        int[] restArr = new int[restArrLength];
        System.arraycopy(arr, 1, restArr, 0, restArrLength);

        return arr[0] + sumArr(restArr);
    }


    public static int countArr(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int restArrLength = arr.length - 1;
        int[] restArr = new int[restArrLength];
        System.arraycopy(arr, 1, restArr, 0, restArrLength);

        return 1 + countArr(restArr);
    }


    public static int maxNumber(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int restArrLength = arr.length - 1;
        int[] restArr = new int[restArrLength];
        System.arraycopy(arr, 1, restArr, 0, restArrLength);

        return Math.max(arr[0], maxNumber(restArr));
    }


    public static int binarySearchRec(int number, int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == number) {
            return mid;
        } else if (arr[mid] > number) {
            return binarySearchRec(number, arr, low, mid - 1);
        } else {
            return binarySearchRec(number, arr, mid + 1, high);
        }
    }
}
