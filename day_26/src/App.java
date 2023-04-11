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
            if (isPrime(arr[i])) {
                System.out.print("Prime\n");
            }
            else {
                System.out.print("Not prime\n");
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
