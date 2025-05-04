package QuestionTwo;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("3248724934","Ayşe");
        BankAccount acc2 = new BankAccount("7893634252", "Mükremin");

        acc1.deposit(1000);  
        acc1.withdraw(200);   
        acc1.withdraw(10000); 

        acc1.displayAccountInfo();

        System.out.println();

        acc2.deposit(-500);   
        acc2.withdraw(1500);  
        acc2.withdraw(-300);  

        acc2.displayAccountInfo();
    }
}
