import java.util.*;

public class Main {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Two-pointer approach
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int currentSum = a[left] + a[right];
            
            if (currentSum == t) {
                System.out.println(left + " " + right);
                return; // Stop after finding the first occurrence
            } else if (currentSum < t) {
                left++; // Increase the sum
            } else {
                right--; // Decrease the sum
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
