import java.util.*;

public class Main {
    public static int minRemoval(int n, int[][] intervals) {
        if (n <= 1) return 0;

        // 1. Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int removals = 0;
        // End time of the first interval (the one that finishes earliest)
        int lastEnd = intervals[0][1];

        // 2. Iterate through the rest of the intervals
        for (int i = 1; i < n; i++) {
            // If the current interval starts before the last one ends, it's an overlap
            if (intervals[i][0] < lastEnd) {
                removals++;
            } else {
                // No overlap, update the end point to the current interval's end
                lastEnd = intervals[i][1];
            }
        }

        return removals;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Handle input based on your format
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt(); // Number of rows (intervals)
        
        if (!sc.hasNextInt()) return;
        int m = sc.nextInt(); // Always 2 (columns)
        
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        System.out.println(minRemoval(n, intervals));
    }
}
