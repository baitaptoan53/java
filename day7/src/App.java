import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        // khoi tao mang để lưu T chuỗi
        String[] arr = new String[T];
        // nhập T chuỗi
        for (int i = 0; i < T; i++) {
            arr[i] = sc.next();
        }
        // hiển thị các kí tự có vị trí chẵn và vị trí lẻ của chuỗi
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.print(" ");
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
