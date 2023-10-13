package lab1;

public class ArrayAnalysis {
    static int[] array = {1, 2, 3, 4, 5};
    static int sum() {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    static int sumEven() {
        int sum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    } 
    static int sumOdd() {
        int sum = 0;

        for (int i : array) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String... args) {
        System.out.println(sum());
        System.out.println(sumEven());
        System.out.println(sumOdd());
    }
}