public class sameArray {
    //find if a number in an array is same or not.
    public static boolean sameNumb(int numb[]){
        boolean num=false;
        for(int i=0;i<numb.length;i++){
            for(int j=(i+1);j<numb.length;j++){
                if(numb[j]==numb[i]){
                     num=true;
                   
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int num[]={2,5,4,1,8,9,4};
        System.out.println(sameNumb(num));

    }
    
}
