import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        int maxSize = 0;

        for (int t : arr) {
            // Remove all submissions >= 5000 seconds old from the front
            while (!queue.isEmpty() && t - queue.peekFirst() >= 5000) {
                queue.pollFirst();
            }
            queue.addLast(t);
            maxSize = Math.max(maxSize, queue.size());
        }

        System.out.println(maxSize);
    }
}