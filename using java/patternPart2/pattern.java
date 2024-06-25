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
    //Inverted and rotated half pyramid

    public static void main(String[] args) {
        hollow_rectangle(5, 4);

    }
}