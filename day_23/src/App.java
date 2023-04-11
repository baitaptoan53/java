import java.util.Scanner;

public class App {

    static class Node {
        int value;
        Node left, right;

        Node(int val) {
            value = val;
            left = null;
            right = null;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.value) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static int findDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        int depth = findDepth(root);
        System.out.println(depth-1);
    }
}
