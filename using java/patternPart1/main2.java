import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        //half pyramind
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();

        }
    }
    
}
