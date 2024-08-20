package recursion;

public class Rec03 {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 5, 6, 7, 9, 12};
        int searchElement = 6;
        System.out.printf("array element sum is %d%n", sumArr(arr));
        System.out.printf("array element count is %d%n", countArr(arr));
        System.out.printf("array biggest number is %d%n", maxNumber(arr));
        System.out.printf("%d is in index %d%n", searchElement, binarySearchRec(searchElement, arr));
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


    public static int binarySearchRec(int number, int[] arr) {

        int mid = (int)Math.floor((double) arr.length / 2);
        int low = 0;
        int high = arr.length - 1;

        if (low >= high) {
            return 0;
        }

        if (arr[mid] == number) {
            return mid;
        } else if (arr[mid] > number) {

            int restArrLength = (int)Math.floor((double) arr.length / 2);
            int[] newArr = new int[restArrLength];
            System.arraycopy(arr, low, newArr, 0, restArrLength);

            return binarySearchRec(number, newArr);
        } else {

            int restArrLength = (int)Math.floor((double) arr.length / 2);
            int[] newArr = new int[restArrLength];
            System.arraycopy(arr, mid, newArr, 0, restArrLength);

            return binarySearchRec(number, newArr);
        }
    }
}
