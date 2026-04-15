import java.util.*;

public class Main {
    public static long maxBottleCost(int n, int x, int[] costs) {
        // 1. Sort costs so we always buy the cheapest available shops
        Arrays.sort(costs);

        // 2. Use prefix sums to quickly calculate total cost of K shops
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + costs[i];
        }

        long totalBottles = 0;
        long daysPassed = 0;

        // 3. Iterate from most shops to fewest shops
        for (int k = n; k >= 1; k--) {
            // Cost on the current day for k shops:
            // (Initial base cost) + (increase per day * days passed)
            long currentCost = prefixSum[k] + (long) k * daysPassed;

            if (currentCost <= x) {
                // How many more days can we afford exactly k shops?
                long additionalDays = (x - currentCost) / k;
                long totalDaysAtThisK = additionalDays + 1;

                totalBottles += totalDaysAtThisK * k;
                daysPassed += totalDaysAtThisK;
            }
        }

        return totalBottles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        
        // Output as long to handle large bottle counts
        System.out.println(maxBottleCost(n, x, costs));
    }
}
