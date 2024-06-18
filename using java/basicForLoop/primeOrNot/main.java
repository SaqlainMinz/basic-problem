
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //the number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " not a prime number");
            }

        }

    }
}
