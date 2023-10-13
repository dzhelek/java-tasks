package lab1;

import java.util.Scanner;

public class Combined {
    static String menu = """
What do you want to do?
1 - actions with arrays
2 - actions with matrix
3 - action with numbers
""";
    static int[] enterArray() {
        var scn = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = scn.nextInt();
        System.out.format("Enter %d elements:\n", n);
        var array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        
        return array;
    }
    static void printMaxMin(int[] array) {
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
    static void printReversed(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n-1-i];
        }

        for (int i : reversed)
            System.out.print(i + " ");
        System.out.println();
    }
    static void printSum(int[] array) {
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        
        System.out.println("sum = " + sum);
    }
    static void printSumEven(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("sum of even elements = " + sum);
    } 
    static void printSumOdd(int[] array) {
        int sum = 0;

        for (int i : array) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum of odd elements = " + sum);
    }
    static int sumDiagonals(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i] + matrix[i][2-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print(menu);
        var scn = new Scanner(System.in);
        int action = scn.nextInt();
        switch (action) {
            case 1 -> {
                var array = enterArray();
                printMaxMin(array);
                printReversed(array);
                printSum(array);
                printSumEven(array);
                printSumOdd(array);
            }
            case 2 -> {
                // var matrix = enterMatrix();
            }
        }
        scn.close();
    }
}
