import java.util.*;
public class maxMin {
    public static void maxArr(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("the max number is:"+max);
    }
    public static void minArr(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("the min number is:"+min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int [3][3];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        minArr(arr);
        maxArr(arr);
    }
}
