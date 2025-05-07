// The Citizen class should have following attributes  name, id, country, sex, maritalStatus, anualIncome, 
// and economyStatus. Validate the fields if the age is below 18 and country   is   not   ‘India’  throw  
// NonEligibleException  and   give proper   message.   Use  toString  method   to   display   the   citizen object in proper format.
//  Use separate packages for Exception and application classes


import java.util.Scanner;

// Custom Exception Class
class NonEligibleException extends Exception {
    public NonEligibleException(String message) {
        super(message);
    }
}

// Citizen Class
class Citizen {
    private String name;
    private int id;
    private String country;
    private String sex;
    private String maritalStatus;
    private double annualIncome;
    private String economyStatus;
    private int age;

    public Citizen(String name, int id, String country, String sex, String maritalStatus,
                   double annualIncome, String economyStatus, int age) throws NonEligibleException {

        if (age < 18 || !country.equalsIgnoreCase("India")) {
            throw new NonEligibleException("Citizen is not eligible: Age must be 18 or above and Country must be India.");
        }

        this.name = name;
        this.id = id;
        this.country = country;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.annualIncome = annualIncome;
        this.economyStatus = economyStatus;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nCitizen Details:" +
               "\n----------------" +
               "\nName: " + name +
               "\nID: " + id +
               "\nCountry: " + country +
               "\nSex: " + sex +
               "\nMarital Status: " + maritalStatus +
               "\nAnnual Income: ₹" + annualIncome +
               "\nEconomy Status: " + economyStatus +
               "\nAge: " + age;
    }
}

// Main Application Class
public class CitizenApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("=== Enter Citizen Details ===");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Country: ");
            String country = sc.nextLine();

            System.out.print("Sex: ");
            String sex = sc.nextLine();

            System.out.print("Marital Status: ");
            String maritalStatus = sc.nextLine();

            System.out.print("Annual Income: ");
            double income = sc.nextDouble();
            sc.nextLine();

            System.out.print("Economic Status (e.g. Below/Above Poverty Line): ");
            String economyStatus = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            Citizen citizen = new Citizen(name, id, country, sex, maritalStatus, income, economyStatus, age);
            System.out.println(citizen);

        } catch (NonEligibleException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred. Please enter valid data.");
        }

        sc.close();
    }
}
