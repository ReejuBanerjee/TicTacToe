import java.util.Scanner;

/**
 * Q2: Manual Substring vs built-in substring()
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSub = getManualSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);

        // Reusing comparison method from Q1 logic
        boolean match = compareStrings(manualSub, builtInSub);
        System.out.println("Do they match? " + match);
    }

    public static String getManualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}