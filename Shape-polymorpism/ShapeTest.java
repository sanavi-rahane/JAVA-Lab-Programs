// Develop a JAVA program to create a class named shape. Create three sub classes namely: circle, triangle and square, each class has 
// two member functions named draw () and erase ().
//  Demonstrate polymorphism concepts by developing suitable methods, defining member data and main program.  


// Base class Shape
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    void erase() {
        System.out.println("Erasing a shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Circle");
    }
}

// Subclass Triangle
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle");
    }
}

// Subclass Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square");
    }
}

// Main class to demonstrate polymorphism
public class ShapeTest {
    public static void main(String[] args) {
        // Base class reference pointing to subclass objects
        Shape shape;

        shape = new Circle();
        shape.draw();
        shape.erase();

        System.out.println();

        shape = new Triangle();
        shape.draw();
        shape.erase();

        System.out.println();

        shape = new Square();
        shape.draw();
        shape.erase();
    }
}
