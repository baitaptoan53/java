import java.util.Scanner;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
