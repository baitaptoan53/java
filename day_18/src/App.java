import java.math.MathContext;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // p là số lượng test case mà bạn muốn thực hiện
        int p = sc.nextInt();
        while (p != 0) {
            int q = sc.nextInt();
            int n = sc.nextInt();
            if (q < 0 || n < 0) {
                System.out.println("n and p should be non-negative");

            } else {
                System.out.println((int) Math.pow(q, n));
            }
            p--;
        }
    }
}
