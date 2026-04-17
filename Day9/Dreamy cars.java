import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            long count = (long) (i + 1) * (n - i);
            if (count % 2 != 0) {
                result ^= f[i];
            }
        }
        
        System.out.println(result);
    }
}
