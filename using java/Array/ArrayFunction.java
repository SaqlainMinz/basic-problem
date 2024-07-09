public class ArrayFunction {
    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 50;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 85, 65, 98 };
        int nonChangeable = 5;
        update(marks, nonChangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(nonChangeable);

    }
}
