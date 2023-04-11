import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            m.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (m.get(s) != null) {

                int key = m.get(s);
                System.out.println(s + "=" + key);
            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}
