import java.util.*;

public class function {
    public static int sumOfNumber(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sumOfNumber(a, b);
        System.out.println(sum);

    }

}
