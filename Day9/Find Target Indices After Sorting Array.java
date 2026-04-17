import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        if (!sc.hasNextInt()) return;
        int k = sc.nextInt();
        
        Arrays.sort(a);
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                indices.add(i);
            }
        }
        
        System.out.println(indices.size());
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i) + (i == indices.size() - 1 ? "" : " "));
        }
        System.out.println();
    }
}
