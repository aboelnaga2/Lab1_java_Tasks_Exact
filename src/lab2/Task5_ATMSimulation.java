package lab2;

import  java.util.Scanner;

public class Task5_ATMSimulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.00;
        boolean running = true;

        System.out.println("--- Welcome to the Java ATM ---");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.printf("Current Balance: $%.2f%n", balance);
                }
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double deposit = input.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Successfully deposited $%.2f%n", deposit);
                    } else {
                        System.out.println("Error: Deposit must be positive.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = input.nextDouble();
                    if (withdrawal <= 0) {
                        System.out.println("Error: Withdrawal must be positive.");
                    } else if (withdrawal > balance) {
                        System.out.println("Error: Insufficient funds (Overdraft denied).");
                    } else {
                        balance -= withdrawal;
                        System.out.printf("Successfully withdrew $%.2f%n", withdrawal);
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false; // Terminate loop
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
        input.close();
    }
}
