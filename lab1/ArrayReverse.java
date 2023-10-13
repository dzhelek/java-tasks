package lab1;

public class ArrayReverse {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] reverse() {
        int n = array.length;
        int[] reversed = new int[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = array[n-1-i];
        }

        return reversed;
    }
    public static void main(String[] args) {
        for (int i : reverse())
            System.out.print(i + " ");
    }
}
