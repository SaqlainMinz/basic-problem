import java.util.*;
public class main {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
       int rev=0;
       for(int i=0;i<number;){
        int lastDigit=number%10;
        rev=(rev*10)+lastDigit;
        number/=10;
       }
       System.out.println(rev);
  }
  
}
