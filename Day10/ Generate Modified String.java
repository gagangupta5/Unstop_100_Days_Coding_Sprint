import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        if (!sc.hasNext()) return;
        String s = sc.next();

        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (isPrime(num)) {
                    primes.add(num);
                }
            }
        }

        Integer uniqueNumber = null;
        if (!primes.isEmpty()) {
            int sum = 0;
            for (int p : primes) {
                sum += p;
            }
            uniqueNumber = sum / primes.size();
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                int index;
                if (uniqueNumber == null) {
                    index = digit;
                } else {
                    index = digit % uniqueNumber;
                }
                result.append((char) ('a' + index));
            } else {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
