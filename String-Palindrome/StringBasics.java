// 7)
// Write a program to check if a given string is a palindrome. 
// Implement a function to count the occurrences of a specific character in a string.
// Write a program to remove all whitespace from a string.

import java.util.Scanner;

public class StringBasics {

    // A) Check if a string is a palindrome (basic logic)
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();  // Case-insensitive check
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    // B) Count specific character without advanced methods
    public static int countCharacter(String str, char target) {
        int count = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
                count++;
        }
        return count;
    }

    // C) Remove whitespace without using replaceAll()
    public static String removeWhitespaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A) Palindrome
        System.out.print("Enter a string to check for palindrome: ");
        String input = sc.nextLine();
        if (isPalindrome(input))
            System.out.println("It is a palindrome!");
        else
            System.out.println("Not a palindrome.");

        // B) Count character
        System.out.print("\nEnter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);
        int count = countCharacter(text, ch);
        System.out.println("Character '" + ch + "' occurs " + count + " times.");

        // C) Remove whitespaces
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter a string with whitespaces: ");
        String withSpaces = sc.nextLine();
        String noSpaces = removeWhitespaces(withSpaces);
        System.out.println("String without whitespaces: " + noSpaces);

        sc.close();
    }
}
