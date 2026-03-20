import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean possible = true;
            int i = 0;

            while (i < n) {

                if (s.charAt(i) == 'W') {
                    i++;
                    continue;
                }

                boolean hasB = false, hasR = false;

                // process segment
                while (i < n && s.charAt(i) != 'W') {
                    if (s.charAt(i) == 'B') hasB = true;
                    if (s.charAt(i) == 'R') hasR = true;
                    i++;
                }

                if (!(hasB && hasR)) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}