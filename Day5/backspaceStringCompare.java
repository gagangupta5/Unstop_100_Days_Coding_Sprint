import java.util.*;

public class Main {

    public static String simulate(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack.length() > 0)
                    stack.deleteCharAt(stack.length() - 1); // backspace
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bob   = scanner.next();
        String alice = scanner.next();

        String bobFinal   = simulate(bob);
        String aliceFinal = simulate(alice);

        System.out.println(bobFinal.equals(aliceFinal) ? "YES" : "NO");
    }
}