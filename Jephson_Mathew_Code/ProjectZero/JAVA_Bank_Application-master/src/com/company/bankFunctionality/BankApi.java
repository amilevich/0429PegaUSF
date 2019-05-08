package com.company.bankFunctionality;

public class BankApi {
         float balance;
         float lastTransaction;
         float withdraw;
         float deposit;
         String firstName;
         String lastName;
         int pin;

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

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    BankApi (){ }

        BankApi(String firstName, String lastName, int pin, float balance, float lastTransaction){
            this.firstName = firstName;
            this.lastName = lastName;
            this.pin = pin;
            this.balance = balance;
            this.lastTransaction = lastTransaction;
        }

        public void deposit(float amount) {
            balance = balance + amount;
            lastTransaction = amount;
            System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " deposited $" + amount + ". Current Balance $" + balance);
        }

        public void getLastTransaction(){
            if(lastTransaction > 0){
                System.out.println("Deposit: $"+lastTransaction);
            }else if(lastTransaction < 0){
                System.out.println("Withdrew: $"+lastTransaction);
            }else{
                System.out.println("There were no previous transactions");
            }
        }

        public void withdraw(float amount) {
            if (balance >= amount) {
                balance = balance - amount;
                lastTransaction = -amount;
                System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " withdrew $" + amount + ". Current Balance $" + balance);
            }
            else if (balance < amount) {

                try
                {
                        throw new IONotEnoughException("Not Enough Money Bro,Sorry ...");

                }
                catch(IONotEnoughException ex)
                {
                    ex.printStackTrace();
                    System.out.println("Unable to withdraw " + amount + " for " + firstName.toUpperCase() + " " + lastName.toUpperCase() + " due to insufficient funds.");
                }

            }
        }
        public void checkBalance() {
        System.out.println("Your Balance is: $"+ balance);
        }

}
