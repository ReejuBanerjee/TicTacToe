import java.util.Scanner;

/**
 * Q1: Manual String comparison vs built-in equals()
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean manualResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Manual comparison (charAt): " + manualResult);
        System.out.println("Built-in comparison (equals): " + builtInResult);
        System.out.println("Are results the same? " + (manualResult == builtInResult));
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}