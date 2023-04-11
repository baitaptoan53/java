import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            n = n / 2;
        }
        System.out.println(max);

    }
}
