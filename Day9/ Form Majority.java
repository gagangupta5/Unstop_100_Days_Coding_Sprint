import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] votes = new int[n];
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            votes[i] = sc.nextInt();
            totalSum += votes[i];
        }
        Arrays.sort(votes);
        long currentSum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            currentSum += votes[i];
            result.add(votes[i]);
            if (currentSum > totalSum / 2) {
                break;
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
        }
    }
}
