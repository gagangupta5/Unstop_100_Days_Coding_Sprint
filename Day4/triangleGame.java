import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] row = new long[n + 1];
        row[0] = 1;

        // Build using: C(n,k) = C(n,k-1) * (n-k+1) / k
        for (int k = 1; k <= n; k++) {
            row[k] = row[k - 1] * (n - k + 1) / k;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k <= n; k++) {
            if (k > 0) sb.append(" ");
            sb.append(row[k]);
        }
        System.out.println(sb.toString());
    }
}