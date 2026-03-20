import java.util.Scanner;

public class Main {
    public static int highestAltitude(int n, int[] arr) {
        
        int current = 0;
        int maxAltitude = 0;

        for (int i = 0; i < n; i++) {
            current += arr[i];
            maxAltitude = Math.max(maxAltitude, current);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(highestAltitude(n, arr));
    }
}