public class slctionSort {
    public static void selectionSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minPos] > num[j]) {
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;

        }
    }

    public static void printSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 6, 8, 7, 9, 2, 3, 1 };
        selectionSort(num);
        printSort(num);
    }

}
