import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalBoxes = scanner.nextInt();
        int n = totalBoxes / 2;          // repeated box appears n times

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < totalBoxes; i++) {
            int label = scanner.nextInt();
            freq.put(label, freq.getOrDefault(label, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }
}