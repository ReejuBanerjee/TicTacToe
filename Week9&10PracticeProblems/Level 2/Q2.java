import java.util.Scanner;
import java.util.Arrays;

/**
 * Q2: Split text into words without using built-in split().
 * @author Reeju Banerjee
 * @version 1.0
 */
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Manual implementation
        String[] manualWords = customSplit(input);
        
        // Built-in implementation
        String[] builtInWords = input.split(" ");

        // Comparison logic
        boolean isSame = compareArrays(manualWords, builtInWords);

        System.out.println("Manual Split: " + Arrays.toString(manualWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Arrays match: " + isSame);
    }

    static int findLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) { return count; }
    }

    /**
     * Manual split logic using space index tracking.
     */
    static String[] customSplit(String text) {
        int len = findLength(text);
        int wordCount = 0;

        // Step 1: Count words based on spaces
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount++; 

        // Step 2: Extract words into the array
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, len);

        return words;
    }

    /**
     * Compares two string arrays for equality.
     */
    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}