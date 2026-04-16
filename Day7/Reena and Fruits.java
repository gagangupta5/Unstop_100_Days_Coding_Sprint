import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < total; i += 2) {
            sum += arr[i]; // arr[i] is always the min of each adjacent pair
        }

        System.out.println(sum);
    }
}