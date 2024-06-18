import java.util.*;
public class main{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    do { 
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(number%10==0){
          continue;
        }
        System.out.println("your number is "+ number);
    } while (true);
  
  }
}