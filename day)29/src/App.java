import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String name[] = new String[n];
        String email[] = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            email[i] = sc.next();
        }
        // neu trung email thi xoa khoi mang
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (email[i].equals(email[j])) {
                    for (int k = j; k < n - 1; k++) {
                        name[k] = name[k + 1];
                        email[k] = email[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
    }
}
