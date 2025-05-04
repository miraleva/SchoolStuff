package QuestionTwo;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Ayşe");
        BankAccount acc2 = new BankAccount("789364", "Mükremin");

        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayAccountInfo();

        System.out.println();

        acc2.deposit(1000);
        acc2.withdraw(1500); 
        acc2.displayAccountInfo();
    }
}
