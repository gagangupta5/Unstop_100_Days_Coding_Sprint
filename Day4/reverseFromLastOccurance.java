import java.util.Scanner;

public class Main {
    public static String transformString(String s, char ch) {
    int lastIndex = s.lastIndexOf(ch);
    
    // Character not found, return original string
    if (lastIndex == -1) return s;
    
    String prefix  = s.substring(0, lastIndex);        // before last occurrence
    String suffix  = s.substring(lastIndex);           // from last occurrence to end
    
    // Reverse the suffix
    String reversedSuffix = new StringBuilder(suffix).reverse().toString();
    
    return prefix + reversedSuffix;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        String s = data[0];
        char ch = data[1].charAt(0);
        
        String result = transformString(s, ch);
        System.out.println(result);
    }
}