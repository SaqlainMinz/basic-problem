
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // WAP to reads a set of integer, and then prints the sum of the even and odd
        // integer.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.println("sum of even number: " + even);
        System.out.println("sum of odd number: " + odd);

    }
}
