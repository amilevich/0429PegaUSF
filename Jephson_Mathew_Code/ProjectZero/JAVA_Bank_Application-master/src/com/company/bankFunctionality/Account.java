package com.company.bankFunctionality;

public class Account extends BankApi {


    public Account() { }

    public Account(String firstName, String lastName, int pin, float balance,float lastTransaction) {
        super(firstName, lastName, pin, balance,lastTransaction);
//        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + ", Balance $" + balance +", Last Transaction "+ lastTransaction);
    }

    @Override
    public String toString() {
        return firstName+","+lastName+","+pin+","+balance+","+lastTransaction;

    }
}
