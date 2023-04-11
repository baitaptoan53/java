import java.util.Scanner;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int numNodes = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            list.add(value);
        }

        System.out.println("Linked list values:");
        for (int value : list) {
            System.out.println(value);
        }
    }
}
