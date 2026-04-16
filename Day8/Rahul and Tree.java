import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        Node root = sortedArrayToBST(arr, 0, n - 1);

        printPreOrder(root);
    }

    private static Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) return null;

        int mid = (start + end + 1) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    private static void printPreOrder(Node node) {
        if (node == null) return;

        String leftStr = (node.left != null) ? String.valueOf(node.left.data) : ".";
        String rightStr = (node.right != null) ? String.valueOf(node.right.data) : ".";

        System.out.println(leftStr + " <- " + node.data + " -> " + rightStr);

        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
