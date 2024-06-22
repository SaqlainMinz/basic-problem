import java.util.Scanner;

public class practiceFunction1 {
    // prime number optemize
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print all prime number
    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printPrime(a);

    }

}
