		package bankApplication;

		import java.util.Scanner;

		public class RegisterLogin {

		//ava.util.Scanner;

		public static class users { 
			
			public String user_name;
			public int user_id = 1;
			private String password;
			public static int count = 1;
			public static String input;

    
			             //Created bank account for the customer
			             // Customer can deposit money in the bank account
			             // customer can Withdraw money and respect daily withdrawal limit
			             // customer can Check their available balance
    
    
			public void users(String Laurien, String Rpassword) {
    	
    							// bank account has been created for the customer name "Laurien"
        
    							this.user_id = count++;
    							this.user_name = Laurien;
    							this.password = Rpassword;
    							count++;
        
        
    							System.out.printf("User %s has been created \n", Laurien);
    							System.out.printf("Enter 'login' to log in or 'register' to open an account");
        
    							// customer created an account
    							// customer can now register to login to monitor her bank account
    }

			public static void login(String Laurien, String Lpassword) {
								for (int i = 1; i <= count; i++) {
								System.out.printf("Enter 'login' to log in or 'register' to open an account");
								
								// use variable in the condition statements to end the loop 


        }  
        
    }

			public static void main(String[] args) {
       
								// method names start with the lowercase letter
								// main is a static method
    	
								Scanner scanner = new Scanner(System.in);
								System.out.println("Laurien:register, deposit money");
								System.out.println("login, logout");
								input = scanner.nextLine();
         
								// customer complete registration process
								// customer has registered, login and logout
         
						while (input.equals("login")) {

                				System.out.println("username");
                				String Laurien = scanner.nextLine();
                				System.out.println("Password");
                				String Lpassword = scanner.nextLine();
                				int a = count;
                				login(Laurien, Lpassword);
                				System.out.println(" log out");
                				input = scanner.nextLine();
            }
						  // loop can be executed at least once, even if the condition is false
            
					while (input.equals("register")) {

							System.out.println("username");
							String Laurien = scanner.nextLine();
							System.out.println("Password");
							String Rpassword = scanner.nextLine();
							
							// users account = new users(Laurien, Password);
							
							System.out.println("");
							input = scanner.nextLine();
                
                
            }
            
            
            
            while ((!input.equals("register")) || (!input.equals("login"))) {
       
 
            }
            	System.out.println("invild option, chose login or regiser!");
                input = scanner.nextLine();
                // code block can be executed 
                // system.out.println(i);

            }          
    }
}

    