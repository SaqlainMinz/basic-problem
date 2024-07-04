public class pattern {
    // Hollow Rectangle
    public static void hollow_rectangle(int totRow, int totCol) {
        for (int i = 1; i <= totCol; i++) {
            for (int j = 1; j <= totRow; j++) {
                if (i == 1 || j == 1 || i == totCol || j == totRow) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

    // Inverted and rotated half pyramid
    public static void inverted_halfPyramind(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.err.println();
        }

    }

    // Inverted half pyramind with number
    public static void num_invertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" " + j + " ");

            }
            System.out.println();
        }
    }

    // Floyd's Triangle
    public static void floyds(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(sum + " ");
                sum++;
            }

            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void butterfly(int num) {
        // first half
        for (int i = 1; i <= num; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("   ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly(50);
    }
}
