import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int numNodes = scanner.nextInt();

        TreeNode root = null;

        for (int i = 0; i < numNodes; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = scanner.nextInt();
            root = insert(root, value);
        }

        System.out.println("Depth of tree:");

        for (int i = 1; i <= numNodes; i++) {
            System.out.println("Depth " + i + ": " + getNumNodesAtDepth(root, i));
        }
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static int getNumNodesAtDepth(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }
        if (depth == 1) {
            return 1;
        }
        return getNumNodesAtDepth(root.left, depth - 1) + getNumNodesAtDepth(root.right, depth - 1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
