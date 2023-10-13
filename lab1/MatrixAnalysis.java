package lab1;

public class MatrixAnalysis {
    static int[][] matrix = {
        {1, 2, 3},
        {4, 8, 6},
        {7, 8, 9}
    };
    static int sumDiagonals() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i] + matrix[i][2-i];
        }
        return sum;
    }
    static int sumDiagonalsExclusive() {
        return sumDiagonals() - matrix[1][1];
    }
    public static void main(String[] args) {
        System.out.println(sumDiagonals());
        System.out.println(sumDiagonalsExclusive());
    }
}
