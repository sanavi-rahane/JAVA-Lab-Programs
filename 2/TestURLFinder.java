

import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURLFinder {

    // Inner class: URLFinder
    static class URLFinder {
        private String url;

        // Constructor
        public URLFinder(String url) {
            this.url = url;
        }

        // Method to check if the URL is valid
        public boolean urlChecker(String inputUrl) {
            try {
                new URL(inputUrl); // Try creating a URL object
                return true;
            } catch (MalformedURLException e) {
                return false;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a URL to check: ");
        String input = scanner.nextLine();

        URLFinder finder = new URLFinder(input);
        boolean isValid = finder.urlChecker(input);

        if (isValid) {
            System.out.println("The URL is valid.");
        } else {
            System.out.println("The URL is not valid.");
        }

        scanner.close();
    }
}
