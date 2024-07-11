import java.util.*;

public class largestNo {
    public static int largestNumber(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int smallestNumber(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 4, 5, 6, 17, 3, 8, 4 };
        System.out.println("the largest number is: " + largestNumber(number));
        System.out.println("the smallest number is: " + smallestNumber(number));
    }

}
