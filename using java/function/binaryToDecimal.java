public class binaryToDecimal {
    public static void binToDec(int binnum){
        int myNum=binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int lastDigit=binnum%10;
            dec=dec+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("DECIMAL NUMBER IS: "+dec);
    }
    public static void main(String[] args) {
        binToDec(1011);

        
    }
    
}
