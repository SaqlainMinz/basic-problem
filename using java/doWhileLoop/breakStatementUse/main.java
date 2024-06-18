import java.util.*;
public class main {
  public static void main(String[] args) {
    //Stop the programif the number is multiple of 10 or not.
    Scanner sc=new Scanner(System.in);
    do { 
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        if(number%10==0){
          break;
        }
        System.out.print(number);
    } while (true); 
  }
  
}
