import java.io.*;
import java.util.*;

public class Main {
    public static int countDifferingBits(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int total = 0;

        for (int i = 0; i <= lenB - lenA; i++) {
            for (int j = 0; j < lenA; j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    total++;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append(" ");
        }

        StringTokenizer st = new StringTokenizer(sb.toString());
        String a = st.nextToken();
        String b = st.nextToken();

        System.out.println(countDifferingBits(a, b));
    }
}