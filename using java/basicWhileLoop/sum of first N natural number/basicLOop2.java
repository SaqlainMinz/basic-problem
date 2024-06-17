import java.util.*;
public class basicLOop2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number: ");
    int range=sc.nextInt();
    int i=1;
    int storage=0;
    while(i<=range){
      storage=storage+i;
      i++;
    }
    System.out.println("Sum of N natural number is: "+storage);
  }
  
}
