public class MaxSubArray {
    public static void maxSubArray(int num[]) {
        // normal method(Brut Force)
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        int totalSubarray = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + num[k];
                }
                totalSubarray++;
                System.out.println(currSum);
                if (max < currSum) {
                    max = currSum;
                }
            }

        }
        System.out.println("total subarray: " + totalSubarray);
        System.out.println("Maximum subarray is: " + max);

    }

    public static void preMaxSubArray(int num[]) {

        // Prefix method
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        // to find maximum array

        for (int i = 0; i < prefix.length; i++) {
            int start = i;
            for (int j = i; j < prefix.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("The maximum sum of the sub array is: " + maxSum);

    }

    public static void kSubArray(int num[]) {
        // KADEN'S ALGORITHM
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kSubArray(number);

    }
}