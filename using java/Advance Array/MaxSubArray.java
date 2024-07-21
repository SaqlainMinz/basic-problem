import java.util.*;
public class MaxSubArray{
    public static void maxSubArray(int num[]){
        // normal method
        int sum=0;
        int max=Integer.MIN_VALUE;
        int totalSubarray=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+num[k];
                }
                totalSubarray++;
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
           
        }
        System.out.println("total subarray: "+totalSubarray);
        System.out.println("Maximum subarray is: " +max);

    }
    
    public static void main(String[] args) {
        int number[]={1,2,4,5,6,8,7,9,2};
        maxSubArray(number);
        

    }
}