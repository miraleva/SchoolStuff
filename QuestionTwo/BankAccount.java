package QuestionTwo;

//A constructor that takes the accountNumber and accountHolderName as arguments and 
//initializes the balance to 0.0.
public class BankAccount {
   private String accNum;   //private mı olsun public mi 
   private String accHolderNum;
   private double balance;

   public BankAccount(String accNum, String accHolderNum) {
      this.accNum = accNum;
      this.accHolderNum = accHolderNum;
      this.balance = 0; //float mı olsun double mı karar ver 
}

public void deposit(){
//(double amount) 
//Adds the given amount to the balance. Prints a confirmation message
}

public void withdraw(){
//(double amount) 
//Subtracts the given amount from the balance if sufficient 
//funds are available. If not, prints an "Insufficient Funds" message. 

}

public void getBalance(){
//: Returns the current balance.
}

public void displayAccountInfo(){
//Prints the account number, account holder name, and current balance
}



}
