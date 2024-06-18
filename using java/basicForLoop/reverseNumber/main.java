import java.util.*;
public class main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number=sc.nextInt();
    
    for(int i=0;i<number;){
      int lastDigit=number%10;
      System.out.print(lastDigit);
      number=number/10;

    }
  }
  
}
