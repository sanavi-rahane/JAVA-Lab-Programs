// Write a Java program to create a class called "TrafficLight" with attributes for 
// color and duration, and methods to change the color and check for red or green.




public class TrafficLight {
    // Attributes
    private String color;
    private int duration; // in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color
    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Traffic light changed to: " + newColor);
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Display current status
    public void displayStatus() {
        System.out.println("Current Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
    }

    // Main method to test the class
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);

        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());

        light.changeColor("Green");
        light.displayStatus();
        System.out.println("Is Red? " + light.isRed());
        System.out.println("Is Green? " + light.isGreen());
    }
}
