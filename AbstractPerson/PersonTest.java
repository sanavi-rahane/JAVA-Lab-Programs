
// Create an abstract class Person with:
// Fields: name, age

// Constructor to initialize the fields

// Abstract method:
// Create a class Student that inherits from Person:

// Additional fields: rollNumber, course

// Override the displayDetails() method to print all student details

// Create another class Teacher that also extends Person:

// Additional fields: employeeId, subject

// Override the displayDetails() method to print all teacher details

// Demonstrate encapsulation by making all fields private and using getter and setter methods.

// In the main() method:

// Create an array of Person references (use polymorphism).

// Store both Student and Teacher objects.

//Call the displayDetails() method for each object using a loop.








// Abstract class Person
abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Abstract method
    public abstract void displayDetails();
}

// Student class inheriting from Person
class Student extends Person {
    private int rollNumber;
    private String course;

    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Getters and setters
    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

// Teacher class inheriting from Person
class Teacher extends Person {
    private String employeeId;
    private String subject;

    public Teacher(String name, int age, String employeeId, String subject) {
        super(name, age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

// Main class
public class PersonTest {
    public static void main(String[] args) {
        // Create array of Person references
        Person[] people = new Person[4];

        // Add Student and Teacher objects
        people[0] = new Student("Alice", 20, 101, "Computer Science");
        people[1] = new Teacher("Mr. Smith", 45, "T001", "Mathematics");
        people[2] = new Student("Bob", 21, 102, "Electronics");
        people[3] = new Teacher("Ms. Johnson", 38, "T002", "Physics");

        // Loop and call displayDetails()
        for (Person person : people) {
            person.displayDetails();  // Polymorphic call
        }
    }
}
