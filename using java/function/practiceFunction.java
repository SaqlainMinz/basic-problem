import java.util.Scanner;

public class practiceFunction {
    // swapping of two number
    public static void swap(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("the value of a: " + a);
        System.out.println("the value of b is: " + b);
    }

    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }
    public static int factorial(int a){
        int factorial=1;
        for (int i=1;i<=a;a--){
            factorial=factorial*a;
        }
                return factorial;
    }
    public static int bicof(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int nmr=factorial(n-r);
        int bicoef=fact_n/(fact_r*(nmr));
        return bicoef;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(bicof(a, b));

    }

}
