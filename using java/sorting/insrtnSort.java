
import java.util.*;

public class insrtnSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding the correct position to enter
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;

        }
    }

    public static void printSort( Integer[] num) {
        for ( Integer i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Integer num[] = { 5, 4, 6, 8, 7, 9, 2, 3, 1 };
        // insertionSort(num);
        // Arrays.sort(num);// inbuilt sorting function
        Arrays.sort(num,Collections.reverseOrder());
    
        printSort(num);
    }

}
