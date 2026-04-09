import java.io.*;
import java.util.*;

class Main {

    public static void pushZerosRight(int[] arr) {
        int j = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill remaining with zeros
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pushZerosRight(arr);

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
                            