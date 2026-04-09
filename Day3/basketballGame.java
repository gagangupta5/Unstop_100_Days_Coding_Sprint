import java.util.*;

public class Main {
    public static int userLogic(String[] ops) {
        List<Integer> stack = new ArrayList<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int size = stack.size();
                int sum = stack.get(size - 1) + stack.get(size - 2);
                stack.add(sum);
            } 
            else if (op.equals("D")) {
                int last = stack.get(stack.size() - 1);
                stack.add(2 * last);
            } 
            else if (op.equals("C")) {
                stack.remove(stack.size() - 1);
            } 
            else {
                stack.add(Integer.parseInt(op));
            }
        }

        int total = 0;
        for (int num : stack) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] ops = new String[n];

        for (int i = 0; i < n; i++) {
            ops[i] = scanner.next();
        }

        System.out.println(userLogic(ops));
    }
}
                            