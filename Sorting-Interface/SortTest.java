// Write a Java program to create an interface Sortable with a method sort() that sorts an array of integers in ascending order. Create 
// two classes BubbleSort and SelectionSort that implement the Sortable interface and provide their own implementations of the sort() method.

// Define the Sortable interface
interface Sortable {
    void sort(int[] array);
}

// BubbleSort class implementing Sortable
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // No swaps = array is sorted
        }
    }
}

// SelectionSort class implementing Sortable
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

// Main class to test the sorting
public class SortTest {
    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 1, 2};
        int[] array2 = {9, 7, 4, 6, 0};

        Sortable bubble = new BubbleSort();
        Sortable selection = new SelectionSort();

        System.out.println("Original array for BubbleSort:");
        printArray(array1);
        bubble.sort(array1);
        System.out.println("Sorted using BubbleSort:");
        printArray(array1);

        System.out.println("\nOriginal array for SelectionSort:");
        printArray(array2);
        selection.sort(array2);
        System.out.println("Sorted using SelectionSort:");
        printArray(array2);
    }

    static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
