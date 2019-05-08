# BANK CONSOLE APPLICATION IN JAVA<br/>

Bank Functionalities <br/>
------------------------<br/>
Asks user for log in account information such as First name, Last Name and Pin number. Searches through TextFile Database located in the resources folder for matches and retrieves the correspoding matching account. <br/>

The text file Data Base is layed out in the following format<br/>

FirstName,LastName,PinNumber,Accountbalance,LastTrasaction<br/>

--Once the Account is correctly matched and retrieved, it presents the user with a menu of options.

1.) Deposit<br/>
2.) WithDraw<br/> 
3.) View Balance<br/>
4.) View Previous Transaction<br/>
5.) Log out<br/>

The User can do this as many times during a their session. 

Once they log out. The Account data, balance, & Lasttransaction are updated in the textFile DataBase for the account worked on.<br/>
The user will be presented to log back in to their account again if they choose to or another user can log in to their account.<br/>
-------------------------------------------------------------------<br/>

The application has custom exception classes that prevents user from withrawing to much if they dont have enough funds or if they dont input the correct menu item option.



