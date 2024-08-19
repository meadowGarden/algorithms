package recursion;

public class Rec01 {

    public static void main(String[] args) {

        printNumber(10);
    }

    public static void printNumber(int number) {

        if (number <= 0) return;

        System.out.println(number);
        printNumber(number - 1);
    }

}
