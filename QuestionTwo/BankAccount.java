package QuestionTwo;

public class BankAccount {
    private String accNum;
    private String accHolderNum;
    private double balance;

    public BankAccount(String accNum, String accHolderNum) {
        this.accNum = accNum;
        this.accHolderNum = accHolderNum;
        this.balance = 0.0;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount to deposit.");
            return -1.0; // return -1.0 is used to handle invalid input cases in the background
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        return balance; // I return the updated balance if deposit was successful
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a positive amount to withdraw.");
            return -1.0; // This return value helps me check for invalid withdrawals in the background
        }
        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return -1.0; // return -1.0 to indicate that there was not enough money
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        return balance; 
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + accHolderNum);
        System.out.println("Current Balance: " + balance);
    }
}
