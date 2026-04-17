import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        
        int n = s.length();
        boolean foundB = false;
        boolean isValid = true;
        
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (current == 'b') {
                foundB = true;
            } else if (current == 'a') {
                if (foundB) {
                    isValid = false;
                    break;
                }
            }
        }
        
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
