package com.project.mainproject;

public class CustomerModel {
	
        float balance;
        float lastTransaction;
        float withdraw;
        float deposit;
        String username;
        String password;
        String firstName;
        String lastName;

   public float getBalance() {
       return balance;
   }

   public void setBalance(float balance) {
       this.balance = balance;
   }

   public void setLastTransaction(float lastTransaction) {
       this.lastTransaction = lastTransaction;
   }

   public float getWithdraw() {
       return withdraw;
   }

   public void setWithdraw(float withdraw) {
       this.withdraw = withdraw;
   }

   public float getDeposit() {
       return deposit;
   }

   public void setDeposit(float deposit) {
       this.deposit = deposit;
   }
   
   public String getUsername() {
       return username;
   }

   public void setUsername(String username) {
       this.username = username;
   }
   
   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

       CustomerModel(String username, String password, String firstName, String lastName,float balance, float lastTransaction){
           this.username = username;
           this.password = password;
    	   this.firstName = firstName;
           this.lastName = lastName;
           this.balance = balance;
           this.lastTransaction = lastTransaction;
       }

       public void deposit(float amount) {
           balance = balance + amount;
           lastTransaction = amount;
           System.out.println("Transaction complete: deposited $" + amount + ". New current balance: $" + balance + ".");
       }

       public void getLastTransaction(){
           if(lastTransaction > 0){
               System.out.println("Deposited: $"+lastTransaction);
           }else if(lastTransaction < 0){
               System.out.println("Withdrew: $"+lastTransaction);
           }else{
               System.out.println("No transactions found.");
           }
       }

       public void withdraw(float amount) {
           if (balance >= amount) {
               balance = balance - amount;
               lastTransaction = -amount;
               System.out.println("Transaction complete: withdrew $" + amount + ". New current balance: $" + balance + ".");
           }
           else if (balance < amount) {

               try
               {
                       throw new IOInsufficientFundsException("Transaction failed: Insufficient funds.");

               }
               catch(IOInsufficientFundsException ex)
               {
                   ex.printStackTrace();
                   System.out.println("Transaction failed: Insufficient funds.");
               }

           }
       }
       public void checkBalance() {
       System.out.println("Current Balance: $"+ balance);
       }

}


