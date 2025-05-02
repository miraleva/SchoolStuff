package QuestionTwo;

public class BankAccount {
   private String accNum;   //private mı olsun public mi 
   private String accHolderNum;
   private double balance;

   public BankAccount(String accNum, String accHolderNum) {
      this.accNum = accNum;
      this.accHolderNum = accHolderNum;
      this.balance = 0; //float mı olsun double mı karar ver 
}
