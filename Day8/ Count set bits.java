import java.util.Scanner;

public class Main {
    // Placeholder for user logic function
    public static int countOnesInBinary(int N) {
        int res=0,i=1;
        while(i<=N){
            String binary = Integer.toBinaryString(i);
            int countOnes = (int)binary.chars().filter(ch -> ch == '1').count();
            res+=countOnes;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the integer N

        // Call the user logic function
        int result = countOnesInBinary(N);
        
        // Output the result
        System.out.println(result);
    }
}
