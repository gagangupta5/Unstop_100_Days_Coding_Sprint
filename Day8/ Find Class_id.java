import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
    }

    // Function declaration
     public static int peakIndexInMountainArray(int[] A) {
    for (int i = 1; i < A.length - 1; i++) {
        if (A[i] >= A[i - 1] && A[i] >= A[i + 1]) {
            return i;
        }
    }
    if (A.length > 1 && A[A.length - 1] >= A[A.length - 2]) {
        return A.length - 1;
    }

    return 0;
}


}
