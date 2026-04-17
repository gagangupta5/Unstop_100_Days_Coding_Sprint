import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }
        
        if (n == 1) {
            System.out.println(0);
            return;
        }
        
        long[] dp = new long[n];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        
        for (int i = 0; i < n; i++) {
            for (int jump = 1; jump <= 3; jump++) {
                if (i + jump < n) {
                    long cost = Math.abs(v[i] - v[i + jump]);
                    dp[i + jump] = Math.min(dp[i + jump], dp[i] + cost);
                }
            }
        }
        
        System.out.println(dp[n - 1]);
    }
}
