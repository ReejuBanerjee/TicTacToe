import java.util.Scanner;

/**
 * Q3: Manual char array conversion vs built-in toCharArray()
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualArray = getCharsManually(text);
        char[] builtInArray = text.toCharArray();

        boolean arraysMatch = compareCharArrays(manualArray, builtInArray);

        System.out.println("Manual array conversion complete.");
        System.out.println("Built-in array conversion complete.");
        System.out.println("Do the arrays match? " + arraysMatch);
    }

    public static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}