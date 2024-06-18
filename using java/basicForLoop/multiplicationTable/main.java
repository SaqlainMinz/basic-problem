import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        //multiplication table
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+(i*number));
        }

    }
}