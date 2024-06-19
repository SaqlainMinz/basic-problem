import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        for(int i=0;i<number;i++){
            
            for(int j=number;j>i;j--){
                System.out.print(" * ");

            }
            System.out.println();
        }
        
    }
    
}
