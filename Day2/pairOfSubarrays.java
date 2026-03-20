import java.util.*;

public class Main {

    static class Pair {
        int l, r;
        Pair(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    public static long calculatePairs(int n, int[] arr) {

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Map: sum -> list of intervals
        Map<Long, List<Pair>> map = new HashMap<>();

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long sum = prefix[j + 1] - prefix[i];
                map.computeIfAbsent(sum, k -> new ArrayList<>())
                   .add(new Pair(i, j));
            }
        }

        long result = 0;

        // Process each sum group
        for (List<Pair> list : map.values()) {

            // Sort by ending index
            list.sort(Comparator.comparingInt(a -> a.r));

            int size = list.size();

            // For each pair
            for (int i = 0; i < size; i++) {
                Pair curr = list.get(i);

                for (int j = 0; j < i; j++) {
                    Pair prev = list.get(j);

                    // Non-overlapping
                    if (prev.r < curr.l) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(calculatePairs(n, arr));
    }
}