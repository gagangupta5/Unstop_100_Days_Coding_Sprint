import java.util.Scanner;

public class Main {
    public static String determineColor(String s) {
        int row=s.charAt(1);
        int col=s.charAt(0)-'a'+1;
        if((row+col)%2==0) return "Black";
        return "White";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}