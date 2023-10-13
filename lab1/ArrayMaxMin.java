package lab1;

import java.util.Scanner;

public class ArrayMaxMin {
    static int[] array;

    static void printMaxMin() {
        int max = array[0];
            int min = array[0];
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = scn.nextInt();
        System.out.format("Enter %d elements:\n", n);
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        
        printMaxMin();
    }
}
