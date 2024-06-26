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

    public static void main(String[] args) {
        num_invertedHalfPyramid(5);
    }
}