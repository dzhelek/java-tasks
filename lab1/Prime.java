package lab1;

public class Prime {
    static boolean isPrime(int n) {
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 7;
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        }
        else {
            System.out.println(n + " is not prime");
        }
    }
}
