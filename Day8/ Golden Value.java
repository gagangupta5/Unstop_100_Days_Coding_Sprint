import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long totalSE = 0;
        long totalSO = 0;

        for (int bit = 0; bit < 31; bit++) {
            int mask = 1 << bit;
            int currentP = 0;
            long e0 = 1, e1 = 0, o0 = 0, o1 = 0;

            for (int i = 0; i < n; i++) {
                currentP ^= ((arr[i] & mask) != 0 ? 1 : 0);
                if ((i + 1) % 2 == 0) {
                    if (currentP == 0) e0++;
                    else e1++;
                } else {
                    if (currentP == 0) o0++;
                    else o1++;
                }
            }

            long bitSE = (e0 * e1) + (o0 * o1);
            long bitSO = (e0 * o1) + (o0 * e1);

            totalSE += bitSE * mask;
            totalSO += bitSO * mask;
        }

        System.out.println(Math.abs(totalSE - totalSO));
    }
}
