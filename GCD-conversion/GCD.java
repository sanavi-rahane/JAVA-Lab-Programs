// 10)
// A.	Write a program to find the greatest common divisor (GCD) of two numbers.
// B.	Write a program to convert a decimal number to binary.

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Find GCD using Euclidean algorithm
        int gcd = findGCD(a, b);

        // Output
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert to binary using built-in method
        String binary = Integer.toBinaryString(decimal);

        // Output
        System.out.println("Binary representation: " + binary);
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
