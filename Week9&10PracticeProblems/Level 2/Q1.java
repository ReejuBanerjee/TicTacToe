import java.util.Scanner;

/**
 * Q1: Find string length without using length() method.
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int manualLen = findLength(input);
        int builtInLen = input.length();

        System.out.println("Manual Length: " + manualLen);
        System.out.println("Built-in length() Result: " + builtInLen);
    }

    /**
     * Logic: Use an infinite loop to count characters until 
     * charAt() throws a runtime exception.
     */
    static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
}