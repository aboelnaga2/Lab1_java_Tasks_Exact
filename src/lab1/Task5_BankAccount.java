package lab1;

public class Task5_BankAccount {
    public static void main(String[] args) {
        String accountHolder = "Abdelrahman";
        long accountNumber = 123456789;
        double balance = 5000.75;
        boolean isActive = true;

        System.out.printf("Name: %s\nAccount: %d\nBalance: %.2f\nActive: %b",
                accountHolder, accountNumber, balance, isActive);
    }
}
