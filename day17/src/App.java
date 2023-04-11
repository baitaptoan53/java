import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        // neu S la so thi in ra so do
        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
