import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String firstName, lastName;
        int idNumber;
        Scanner input = new Scanner(System.in);
        firstName = input.next();
        lastName = input.next();
        idNumber = input.nextInt();
        int scoreNumber = input.nextInt();
        int[] scores = new int[scoreNumber];
        for (int i = 0; i < scoreNumber; i++) {
            scores[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < scoreNumber; i++) {
            sum += scores[i];
        }
        int score = sum / scoreNumber;
        char grade = ' ';
        if (score >= 90 && score <= 100) {
            grade = 'O';
        } else if (score >= 80 && score < 90) {
            grade = 'E';
        } else if (score >= 70 && score < 80) {
            grade = 'A';
        } else if (score >= 55 && score < 70) {
            grade = 'P';
        } else if (score >= 40 && score < 55) {
            grade = 'D';
        } else if (score < 40) {
            grade = 'T';
        }
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + grade);

    }
}
