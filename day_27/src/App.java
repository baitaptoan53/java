import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int d1, d2, m1, m2, y1, y2;
        Scanner sc = new Scanner(System.in);
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();
        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();
        if (y1 > y2) {
            System.out.println(10000);
        } else if (y1 == y2) {
            if (m1 > m2) {
                System.out.println(500 * (m1 - m2));
            } else if (m1 == m2) {
                if (d1 > d2) {
                    System.out.println(15 * (d1 - d2));
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
