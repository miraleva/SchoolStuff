package BankAccount;

public class BankAccount {
    private int accountNum;
    private double balance;

    public int AccountNumGet() {
        return this.accountNum;
    }

    public void AccountNumSet(int accountNum) {
        this.accountNum = accountNum;

    }

    public double balanceGet() {
        return this.balance;
    }

    public void balanceSet(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

}
