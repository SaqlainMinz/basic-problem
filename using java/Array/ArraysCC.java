import java.util.*;

public class ArraysCC {
    public static void main(String[] args) {
        // Creation of Array
        int marks[] = new int[50];
        marks[0] = 15;
        marks[1] = 18;
        marks[2] = 97;
        // System.out.println(marks);
        String subject[] = { "Math", "Physics", "Chemstry" };
        // System.out.println(subject[0]);
        // Input,Output,Update
        Scanner sc = new Scanner(System.in);
        int score[] = new int[50];
        score[0] = sc.nextInt();
        score[1] = sc.nextInt();
        score[2] = sc.nextInt();
        score[3] = sc.nextInt();
        System.out.println("pakisten: " + score[0]);
        System.out.println("India: " + score[1]);
        System.out.println("Zimbabwe: " + score[2]);
        System.out.println("Newziland: " + score[3]);
        score[3] = score[3] + 5;
        System.out.println("Updated score of Newziland is: " + score[3]);
        int Percentage = (score[0] + score[1] + score[2] + score[3]) / 4;
        System.out.println("Percentage= " + Percentage + "%");
        // Length of the Arrray
        System.out.println("The length of the score Array is: " + score.length);

    }

}
