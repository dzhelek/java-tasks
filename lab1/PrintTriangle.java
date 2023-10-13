package lab1;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("n = ");
        int n = scn.nextInt();
        scn.close();

        for(int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
        
    }
}
