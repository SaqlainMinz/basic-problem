import java.util.Scanner;

public class practiceFunction3 {
    // Average of three number
    public static int avgOfThreeNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number c: ");
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        return avg;

    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(int a) {
        int palindrome = a;
        int reverse = 0;
        while (a != 0) {
            int nNum = a % 10;
            reverse = reverse * 10 + nNum;
            a = a / 10;
        }
        if (palindrome == reverse) {
            return true;
        } else {
            return false;
        }

    }
    public static int sumOfDigit(int num){
        int sum=0;
        while(num!=0){
            int lastdigit=num%10;
            sum=sum+lastdigit;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // if (isPalindrome(number)) {
        //     System.out.println(number + " is palindrome");
        // } else {
        //     System.out.println(number + "is not palindrome");
        // }

        // if (isEven(number)) {
        //     System.out.println(number + " is even");
        // } else {
        //     System.out.println(number + " is odd");
        // }
        System.out.println(sumOfDigit(number));
    }

}
