import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        //print char pattern
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many line you want to print: ");
        int n=sc.nextInt();
        System.out.print("Enter the character: ");
        char character=sc.next().charAt(0);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }
}
