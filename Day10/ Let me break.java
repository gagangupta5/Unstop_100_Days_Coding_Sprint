import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String s1 = sc.next();
        
        if (!sc.hasNext()) return;
        String s2 = sc.next();
        
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        boolean s1BreaksS2 = true;
        boolean s2BreaksS1 = true;
        
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] < charArray2[i]) {
                s1BreaksS2 = false;
            }
            if (charArray2[i] < charArray1[i]) {
                s2BreaksS1 = false;
            }
        }
        
        if (s1BreaksS2 || s2BreaksS1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
