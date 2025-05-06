// 5)
// A.	An ArrayList consists of 1-25 numbers.  Write a Java program to remove prime numbers  from an ArrayList using an iterator.

// B.	 Write a Java program to
// a.      Create and traverse (or iterate) an ArrayList using a for-loop, iterator, and advance for-loop.
// b. Check if the element(value) exists in the ArrayList?
// C. Add element at the particular index of the ArrayList?

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListOperations {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add 1 to 25 in ArrayList
        for (int i = 1; i <= 25; i++) {
            list.add(i);
        }

        System.out.println("Original List:");
        System.out.println(list);

        // ===== 5A: Remove prime numbers using Iterator =====
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (isPrime(num)) {
                it.remove();
            }
        }

        System.out.println("\nList after removing prime numbers:");
        System.out.println(list);

        // ===== 5B-a: Traverse using different methods =====

        // Using for-loop
        System.out.println("\nTraverse using for-loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Using Iterator
        System.out.println("\n\nTraverse using iterator:");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        // Using advanced for-loop (for-each)
        System.out.println("\n\nTraverse using for-each loop:");
        for (int value : list) {
            System.out.print(value + " ");
        }

        // ===== 5B-b: Check if element exists =====
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter number to check if it exists in the list: ");
        int checkNum = scanner.nextInt();

        if (list.contains(checkNum)) {
            System.out.println(checkNum + " exists in the list.");
        } else {
            System.out.println(checkNum + " does NOT exist in the list.");
        }

        // ===== 5C: Add element at specific index =====
        System.out.print("\nEnter element to insert: ");
        int newElement = scanner.nextInt();

        System.out.print("Enter index (0 to " + list.size() + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index <= list.size()) {
            list.add(index, newElement);
            System.out.println("List after adding " + newElement + " at index " + index + ":");
            System.out.println(list);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}

