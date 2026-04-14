import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < Q; i++) {
            int count  = scanner.nextInt();  // A: frequency
            int number = scanner.nextInt();  // B: the number

            // Accumulate instead of overwrite
            freqMap.put(number, freqMap.getOrDefault(number, 0) + count);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxNum  = Integer.MIN_VALUE;
        int minNum  = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num  = entry.getKey();
            int freq = entry.getValue();

            // Highest frequency → largest number on tie
            if (freq > maxFreq || (freq == maxFreq && num > maxNum)) {
                maxFreq = freq;
                maxNum  = num;
            }

            // Lowest frequency → smallest number on tie
            if (freq < minFreq || (freq == minFreq && num < minNum)) {
                minFreq = freq;
                minNum  = num;
            }
        }

        System.out.println(Math.abs(maxNum - minNum));
    }
}