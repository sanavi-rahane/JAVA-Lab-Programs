
// 40)	Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
// Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter 
// of each shape. 





// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();
    
    // Abstract method to calculate the perimeter
    public abstract double calculatePerimeter();
}

// Circle class that extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = π * r^2
    }

    // Implement calculatePerimeter for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Perimeter = 2 * π * r
    }
}

// Triangle class that extends Shape
class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor for Triangle
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implement calculateArea for Triangle
    @Override
    public double calculateArea() {
        return (base * height) / 2; // Area = (base * height) / 2
    }

    // Implement calculatePerimeter for Triangle
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC; // Perimeter = sideA + sideB + sideC
    }
}

// Main class to test the functionality
public class AreaAndPerimeter {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        
        // Create a Triangle object
        Triangle triangle = new Triangle(6.0, 4.0, 5.0, 5.0, 6.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}























// Design a simple system to calculate the area of different 2D shapes using interfaces in Java.
// Define an interface named Shape with a method:
// Create the following classes that implement the Shape interface:

// Circle with a field radius

// Rectangle with fields length and width

// Triangle with fields base and height

// Each class must implement the calculateArea() method according to the respective formula:

// Circle: π × radius²

// Rectangle: length × width

// Triangle: 0.5 × base × height

// In the main() method, use polymorphism to create an array of Shape references and call calculateArea() on each.



// Define the Shape interface with a method to calculate area





// interface Shape {
//     double calculateArea();
// }

// // Circle class implementing the Shape interface
// class Circle implements Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public double calculateArea() {
//         return Math.PI * Math.pow(radius, 2);  // π * radius^2
//     }
// }

// // Rectangle class implementing the Shape interface
// class Rectangle implements Shape {
//     private double length;
//     private double width;

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     public double calculateArea() {
//         return length * width;  // length * width
//     }
// }

// // Triangle class implementing the Shape interface
// class Triangle implements Shape {
//     private double base;
//     private double height;

//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     @Override
//     public double calculateArea() {
//         return 0.5 * base * height;  // 0.5 * base * height
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Create an array of Shape references
//         Shape[] shapes = new Shape[3];

//         // Initialize the shapes with specific values
//         shapes[0] = new Circle(5.0); // Circle with radius 5
//         shapes[1] = new Rectangle(4.0, 6.0); // Rectangle with length 4 and width 6
//         shapes[2] = new Triangle(4.0, 3.0); // Triangle with base 4 and height 3

//         // Calculate and print the area of each shape using polymorphism
//         for (Shape shape : shapes) {
//             System.out.println("Area: " + shape.calculateArea());
//         }
//     }
// }
