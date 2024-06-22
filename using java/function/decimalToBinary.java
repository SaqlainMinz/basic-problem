public class decimalToBinary {
    public static void decTobin(int n){
        int myNUm=n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println("binary number of "+myNUm+" is "+bin);
    }
    public static void main(String[] args) {
        decTobin(3);
        
    }
}
