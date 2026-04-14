import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();

        Map<String, Integer> inventory = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            int type     = scanner.nextInt();
            String name  = scanner.next();
            int quantity = scanner.nextInt();

            if (type == 1) {
                // Add chocolates to inventory
                inventory.put(name, inventory.getOrDefault(name, 0) + quantity);

            } else {
                // Sell min(requested, available)
                int available = inventory.getOrDefault(name, 0);
                int sold      = Math.min(quantity, available);

                inventory.put(name, available - sold);

                if (sb.length() > 0) sb.append("\n");
                sb.append(sold);
            }
        }

        System.out.println(sb.toString());
    }
}