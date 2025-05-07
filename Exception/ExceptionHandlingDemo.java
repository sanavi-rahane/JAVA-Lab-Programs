
// Write  a Java program that handles various types of exceptions while performing different operations. 
// The application should read data from a file specified by the user, handling potential `FileNotFoundException` and `IOException`.
//  It should also allow the user to input values for arithmetic operations and handle division by zero using `ArithmeticException`.
//   Additionally, implement exception handling for `InputMismatchException` when the user provides invalid input, `
//   ArrayIndexOutOfBoundsException` for accessing invalid indices in arrays, and `NullPointerException` when performing operations on `null` values.
//  The program should provide user-friendly error messages and ensure smooth execution even when exceptions occur.

import java.io.*;
import java.util.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\n=== Exception Handling Menu ===");
            System.out.println("1. Read from file");
            System.out.println("2. Perform division");
            System.out.println("3. Access array element");
            System.out.println("4. Operate on null object");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter file path: ");
                        String filePath = scanner.nextLine();
                        readFile(filePath);
                        break;

                    case 2:
                        performDivision(scanner);
                        break;

                    case 3:
                        accessArray(scanner);
                        break;

                    case 4:
                        triggerNullPointer();
                        break;

                    case 5:
                        continueProgram = false;
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        scanner.close();
    }

    // File reading with FileNotFoundException and IOException
    public static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("File content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the path.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Division with ArithmeticException
    public static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter numerator: ");
            int num = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int den = scanner.nextInt();
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // Array access with ArrayIndexOutOfBoundsException
    public static void accessArray(Scanner scanner) {
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter index to access (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            scanner.nextLine(); // Clear buffer
        }
    }

    // NullPointerException demonstration
    public static void triggerNullPointer() {
        try {
            String text = null;
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to operate on a null object.");
        }
    }
}
