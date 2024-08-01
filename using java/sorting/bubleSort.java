public class bubleSort {
    public static void main(String[] args) {
        // bubble sort,
        int num[] = { 5, 4, 6, 8, 7, 9, 2, 3, 1 };
        bubbleSort(num);
        printSort(num);
    }

    public static void bubbleSort(int[] num) {
        for (int i = 0; i < num.length -1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }
    }

    public static void printSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }

}