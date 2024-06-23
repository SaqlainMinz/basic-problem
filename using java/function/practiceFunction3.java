import java.util.*;
public class practiceFunction3 {
    //Average of three number
    public static int avgOfThreeNo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a: ");
       int a=sc.nextInt();
        System.out.print("Enter the number b: ");
        int b=sc.nextInt();
        System.out.print("Enter the number c: ");
       int c=sc.nextInt();

        int avg=(a+b+c)/3;
        return avg;

    }
    public static void main(String[] args) {
        System.out.println(avgOfThreeNo());
    }
    
}
