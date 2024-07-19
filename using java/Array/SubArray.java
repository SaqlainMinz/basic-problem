public class SubArray {
    public static void subArray(int number[]) {
        for (int i = 0; i <= number.length - 1; i++) {
            for (int j = i; j <= number.length - 1; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void sumSubArray(int number[]) {
        for (int i = 0; i <= number.length - 1; i++) {
            for (int j = i; j <= number.length - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + number[k];
                }
                System.out.print(sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        sumSubArray(number);

    }

}
