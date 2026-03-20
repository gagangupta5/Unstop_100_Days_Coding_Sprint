import java.util.*;

public class Main {

    public static int goodSum(int N, int[] A) {

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < N; i++) {

            if (A[i] >= 0) {
                stack.push(A[i]);
                sum += A[i];
            } else {
                int need = Math.abs(A[i]);
                int removedSum = 0;

                // Remove minimum elements from end
                while (!stack.isEmpty() && removedSum < need) {
                    int val = stack.pop();
                    removedSum += val;
                    sum -= val;
                }

                // Add abs(X)
                stack.push(need);
                sum += need;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println(goodSum(N, A));
    }
}