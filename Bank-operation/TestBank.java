// 8)   Design a class BankAccount with methods for deposit, withdraw, and check balance. 
// Implement exception handling for insufficient funds during withdrawal.

import java.util.Scanner;

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        } else {
            System.out.println("Enter a valid deposit amount.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance to withdraw ₹" + amount);
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main class
public class TestBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\n------ Bank Menu ------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our banking system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
    }
}











// . simple banking system that handles user withdrawals, including proper use of exception handling and custom exceptions.
// Requirements:
// 1.	Create a class BankAccount with the following:

// ○	Field: double balance

// ○	Constructor to initialize balance

// ○	Method:

//  If the withdrawal amount is greater than the balance, throw a custom exception named InsufficientFundsException.

// ○	Otherwise, deduct the amount from the balance.

// 2. Define a custom exception class:
// ●	Include a constructor that accepts a custom error message.

// In the main() method:

// ●	Create a BankAccount object with an initial balance.

// ●	Try to withdraw different amounts (some valid, some invalid).

// ●	Catch the exception and display appropriate error messages.


// import java.util.Scanner;

// // Custom Exception Class
// class InsufficientFundsException extends Exception {
//     public InsufficientFundsException(String message) {
//         super(message);
//     }
// }

// // BankAccount Class
// class BankAccount {
//     private double balance;

//     public BankAccount(double balance) {
//         this.balance = balance;
//     }

//     public void withdraw(double amount) throws InsufficientFundsException {
//         if (amount > balance) {
//             throw new InsufficientFundsException("Insufficient funds. You tried to withdraw ₹" + amount + ", but your balance is ₹" + balance + ".");
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawal of ₹" + amount + " successful. Remaining balance: ₹" + balance);
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// // Main Class
// public class BankingSystem {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BankAccount account = new BankAccount(5000); // Initial balance ₹5000

//         System.out.println("Welcome to the Simple Banking System!");
//         System.out.println("Your current balance is: ₹" + account.getBalance());

//         while (true) {
//             try {
//                 System.out.print("\nEnter amount to withdraw (or -1 to exit): ₹");
//                 double amount = sc.nextDouble();

//                 if (amount == -1) {
//                     System.out.println("Exiting. Final balance: ₹" + account.getBalance());
//                     break;
//                 }

//                 account.withdraw(amount);
//             } catch (InsufficientFundsException e) {
//                 System.out.println("Error: " + e.getMessage());
//             } catch (Exception e) {
//                 System.out.println("Invalid input. Please enter a valid number.");
//                 sc.next(); // Clear invalid input
//             }
//         }

//         sc.close();
//     }
// }
