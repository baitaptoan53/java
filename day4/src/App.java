import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            checkAge(arr[i]);
        }
    }

    public static void checkAge(int age) {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age > 18) {
            System.out.println("You are old.");
        } else if (age < 0) {
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
}
