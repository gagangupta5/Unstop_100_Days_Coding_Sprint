import java.io.*;
import java.util.*;

public class Main {
    public static int countConsistentCars(String components, int n, List<String> models) {
        Set<Character> allowed = new HashSet<>();
        for (char c : components.toCharArray()) {
            allowed.add(c);
        }

        int count = 0;
        for (String model : models) {
            boolean consistent = true;
            for (char c : model.toCharArray()) {
                if (!allowed.contains(c)) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        // Read ALL input at once and tokenize everything together
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append(" ");
        }

        StringTokenizer st = new StringTokenizer(sb.toString());

        String components = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        List<String> models = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            models.add(st.nextToken());
        }

        int result = countConsistentCars(components, n, models);
        System.out.println(result);
    }
}
                       