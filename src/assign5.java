// Write a program to check if the two strings entered by the user are anagrams or not.
// Two words are said to be anagrams if the letters of one word can be rearranged to form the other word.
// For example, jaxa and ajax are anagrams of each other.
import java.util.Arrays;
import java.util.Scanner;

public class assign5 {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert to lowercase
        str1 = removeWhitespace(str1).toLowerCase();
        str2 = removeWhitespace(str2).toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static String removeWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Anagram Checker Menu");
            System.out.println("1. Check two strings");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();

                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();

                    boolean areAnagrams = areAnagrams(str1, str2);

                    if (areAnagrams) {
                        System.out.println("The strings are anagrams.");
                    } else {
                        System.out.println("The strings are not anagrams.");
                    }
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 2);

        scanner.close();
    }
}