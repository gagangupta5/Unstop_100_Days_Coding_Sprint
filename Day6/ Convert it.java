import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int currentMax = -1; // Since elements are >= 0
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
            // Update the maximum value encountered up to this index
            if (a[i] > currentMax) {
                currentMax = a[i];
            }
            
            // Modify the element by adding the max value found so far
            int modifiedValue = a[i] + currentMax;
            
            // Print the value followed by a space
            System.out.print(modifiedValue + (i == n - 1 ? "" : " "));
        }
    }
}
