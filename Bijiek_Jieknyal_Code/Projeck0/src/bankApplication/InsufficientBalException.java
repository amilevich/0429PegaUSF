package bankApplication;

import java.util.Scanner;

public class InsufficientBalException extends Exception {

	@Override
	public String toString() {
		return "InsufficientBalException []";
	}

	//Withdraw money  and set daily withdrawal limit
	
public void WithdrawMoney() throws InsufficientBalException, MiniumAmountDeposit{


    double Currentbalance = 0.00;
    Scanner deposit = new Scanner(System.in);
    System.out.println("please enter the deposit amount");
    double Depositamount = deposit.nextDouble();
    Currentbalance += Depositamount ;
    System.out.println("your currentbalance="+Currentbalance);

    /*double Currentbalanace = despositMoney();*/
    
  //setDaily Withdrawl limit
    final double setDailyLimit = 500.00; 
    
    Scanner withDraw = new Scanner(System.in);
    System.out.println("please enter the withdraw amount");
    double WithdrawMoney =withDraw.nextDouble();


if(WithdrawMoney > Currentbalance)
    System.out.println("you have less amount : your current balance is="+Currentbalance);

else if (WithdrawMoney > setDailyLimit)
    System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

else 
    Currentbalance -= WithdrawMoney;
    System.out.println("your current balance is="+Currentbalance); }

}

/*public void setWithdrawlLimit()throws exceedLimit{
Scanner scn = new Scanner(System.in);
System.out.println("please enter the withdraw amount");
   double  enterAmount = scn.nextDouble();
double DailysetLimit = 2500;

if(enterAmount>DailysetLimit)
    System.out.println("you have exceed daily limit : your dailyLimit"+DailysetLimit);


}*/
