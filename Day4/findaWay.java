import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Main {
    public static int maxLength = 0;

public static int userLogic(TreeNode root) {
    maxLength = 0;
    height(root);
    return maxLength;
}

private static int height(TreeNode node) {
    if (node == null) return 0;

    int leftHeight  = height(node.left);
    int rightHeight = height(node.right);

    // Path through this node spans leftHeight + rightHeight edges
    maxLength = Math.max(maxLength, leftHeight + rightHeight);

    return Math.max(leftHeight, rightHeight) + 1;
}

    public static TreeNode constructTree(int i, List<int[]> nodes) {
        if (i < 0 || i >= nodes.size()) {
            return null;
        }
        TreeNode node = new TreeNode(i + 1);
        if (nodes.get(i)[0] != -1) {
            node.left = constructTree(nodes.get(i)[0] - 1, nodes);
        }
        if (nodes.get(i)[1] != -1) {
            node.right = constructTree(nodes.get(i)[1] - 1, nodes);
        }
        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            nodes.add(new int[] {l, r});
        }
        TreeNode root = constructTree(0, nodes);
        int result = userLogic(root);
        System.out.println(result);
    }
}