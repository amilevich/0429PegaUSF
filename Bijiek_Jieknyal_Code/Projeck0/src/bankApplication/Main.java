package bankApplication;

//public class Main {

import java.util.Scanner;

public class Main {
    int accountid;
    String employeename;
    String IFSCcode;

    
   // Bank administrator maintains the customer ID

    // Retrieves the list of accounts from the database

    // Gets detail information about a customer account

    
    
   public Main(int accountid,String employeeName,String IFSCcode){
    
	   this.accountid = accountid;
	   this.employeename = employeeName;
	   this.IFSCcode = IFSCcode;
   }

    //Withdraw money and set daily withdrawal limit
   
    public void WithdrawMoney() throws InsufficientBalException, MiniumAmountDeposit{

    			// provide information to the customers about account activities including balance and withdrawals
    			
    						double availabletbalance = -30.00;
    						Scanner deposit = new Scanner(System.in);
    						System.out.println("please enter the deposit amount");
    						double Depositamount = deposit.nextDouble();
    						availabletbalance += Depositamount ;
    						System.out.println("your availablebalance="+availabletbalance);

        
        //setDaily Withdrawal limit
        
    						final double setDailyLimit = 500.00;     

    										Scanner withDraw = new Scanner(System.in);
    										System.out.println("please enter the withdraw amount");
    										double WithdrawMoney =withDraw.nextDouble();


    						if(availabletbalance < WithdrawMoney)
    											System.out.println("you have less amount : your available balance is="+availabletbalance);

    						else if (WithdrawMoney > setDailyLimit)
    								System.out.println("you have entered amount exceed than daily limit : your dailyLimit="+setDailyLimit);

    						else 
    							availabletbalance -= WithdrawMoney;
    							System.out.println("your available balance is="+availabletbalance);

    }


    						/* Exceeded daily withdrawal limit amount

        						if(enterAmount>DailysetLimit)
            					System.out.println("you have exceeded daily limit : your dailyLimit"+DailysetLimit);


    }*/

    				public String toString(){

    						return "accountid="+this.accountid + "employeename="+this.employeename + "IFSCcode="+this.IFSCcode;
    				}


    				public static void main(String[] args){
    						Main account = new Main(1234455571,"Frank","ICIC09");
    						System.out.println("your account has been temporarily suspended : " +account);
    				
    				/* bank overdraft 
    				 * customer cannot take money out of her account anymore unless sufficient amount
    				  
    				   
    				// Deposits money into an account
        try {
            	account.despositMoney();
        		} catch (MiniumAmountDeposit e) {
            		e.printStackTrace();
        }*/

        try {
        		account.WithdrawMoney();
        }
        
        catch (InsufficientBalException | MiniumAmountDeposit e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        		
        		//insufficient amount in the bank
        		// customer account is suspended due to lack of fund
        }
        
        		// account withdrawal limit policy is set 
        /*try {
            account.setWithdrawlLimit();
        }
        
        
        // the amount you have withdrawn has exceeded the amount you have deposited in bank
         
         catch (exceedLimit e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

*/      
    }

}