// 42)	A) Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
// One constructor takes the title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.

// Write a Java program to create a class called "TrafficLight" with attributes for color and duration,
//  and methods to change the color and check for red or green.


public class Book {
    // Instance variables
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor (title and author)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price if not provided
    }

    // Parameterized constructor (title, author, and price)
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }

    // Main method to test constructors
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Using Default Constructor:");
        defaultBook.displayDetails();

        // Using parameterized constructor (title and author)
        Book partialBook = new Book("To Kill a Mockingbird", "Harper Lee");
        System.out.println("Using Constructor with Title and Author:");
        partialBook.displayDetails();

        // Using parameterized constructor (title, author, and price)
        Book fullBook = new Book("1984", "George Orwell", 15.99);
        System.out.println("Using Constructor with Title, Author, and Price:");
        fullBook.displayDetails();
    }
}










// traffic light code



// public class TrafficLight {
//     // Attributes
//     private String color;
//     private int duration; // in seconds

//     // Constructor
//     public TrafficLight(String color, int duration) {
//         this.color = color;
//         this.duration = duration;
//     }

//     // Method to change the color
//     public void changeColor(String newColor) {
//         this.color = newColor;
//         System.out.println("Traffic light changed to: " + newColor);
//     }

//     // Method to check if the light is red
//     public boolean isRed() {
//         return color.equalsIgnoreCase("red");
//     }

//     // Method to check if the light is green
//     public boolean isGreen() {
//         return color.equalsIgnoreCase("green");
//     }

//     // Display current status
//     public void displayStatus() {
//         System.out.println("Current Color: " + color);
//         System.out.println("Duration: " + duration + " seconds");
//     }

//     // Main method to test the class
//     public static void main(String[] args) {
//         TrafficLight light = new TrafficLight("Red", 30);

//         light.displayStatus();
//         System.out.println("Is Red? " + light.isRed());
//         System.out.println("Is Green? " + light.isGreen());

//         light.changeColor("Green");
//         light.displayStatus();
//         System.out.println("Is Red? " + light.isRed());
//         System.out.println("Is Green? " + light.isGreen());
//     }
// }
