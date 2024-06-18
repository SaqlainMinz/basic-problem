import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        //to find the factorial of a number.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =sc.nextInt();
        int factorial=1;
        for(int i=1;i<=number;number--){
            factorial=factorial*number;
        }
        System.err.println("The factorial of a number is: "+factorial);
    }
}