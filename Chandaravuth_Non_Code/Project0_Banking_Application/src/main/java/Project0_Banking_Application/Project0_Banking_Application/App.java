package Project0_Banking_Application.Project0_Banking_Application;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;




public class App 
{	
	static String users;
	static String pws;
	//static Account globalAccount;
	//static Customer globalCustomer;
	static double savingAccountNumber=0;
	static double tempTotalBalance;
	static double totalBalance;
	static double tempBalance;
	static int idcustomer=0;
	static String userEmploye="emp";
	static String passwordEmploye="password";
    public static void main( String[] args )
    {
    
    	printScreen();
    }
    
    public static void printScreen() {
        Scanner input = new Scanner(System.in); 
        System.out.println("************************************************************************************");
        System.out.println("Type 1: to login to your account");
        System.out.println("Type 2: to register new account");
        System.out.print("Enter: ");
        int enter = input.nextInt();
        switchCase(enter);
        System.out.println("************************************************************************************");
    }
    
    
    public static void switchCase(int n)
    {
    	
    	switch(n)
    	{
    	case 1:
    		tryLoginUser();
    		Scanner input = new Scanner(System.in);
    		System.out.println();
    		System.out.println("Type 1: login");
    		System.out.println("Type 2: register");
    		System.out.println("Type 3: Deposit");
    		System.out.println("Type 4: Withdraw");
    		System.out.println("Type 5: Transfer");
    		n=input.nextInt();
    		switchCase(n);
    		//printScreen();

    		break;
    	case 2:	
    		Validation.validNewAccount();
    		break;
    	case 3:
    		accountdeposit();
    		Scanner input1 = new Scanner(System.in);
    		//System.out.println("Type 1: login");
    		System.out.println();
    		System.out.println("Type 1: login");
    		System.out.println("Type 2: register");
    		System.out.println("Type 3: Deposit");
    		System.out.println("Type 4: Withdraw");
    		System.out.println("Type 5: Transfer");
    		n=input1.nextInt();
    		switchCase(n);
    		break;
    	case 4:
    		accountwithdraw();
    		Scanner input2 = new Scanner(System.in);
    		//System.out.println("Type 1: login");
    		System.out.println();
    		System.out.println("Type 1: login");
    		System.out.println("Type 2: register");
    		System.out.println("Type 3: Deposit");
    		System.out.println("Type 4: Withdraw");
    		System.out.println("Type 5: Transfer");
    		n=input2.nextInt();
    		switchCase(n);
    		break;
    	case 5:
    		accountTransfer();
    		Scanner input3 = new Scanner(System.in);
    		//System.out.println("Type 1: login");
    		System.out.println();
    		System.out.println("Type 1: login");
    		System.out.println("Type 2: register");
    		System.out.println("Type 3: Deposit");
    		System.out.println("Type 4: Withdraw");
    		System.out.println("Type 5: Transfer");
    		n=input3.nextInt();
    		switchCase(n);
    		
    		break;
    	default :
    		System.out.println("ERROR");
    	}
    }
    
    public static void registerCustomer(String fname,String lname,String username,String password,String balance)
    {
    	Customer c = new Customer();
    	
    	
    	Scanner input = new Scanner(System.in);
    	ArrayList<Account> account = new ArrayList<Account>();
    	String fileCustomer = "./data/CustomerInformation.txt";
    	String fileAccount = "./data/AccountInformation.txt";
    	String filePassword = "./data/PasswordInformation.txt";
    	
    	
    	StorePassword storepassword = new StorePassword(password,idcustomer);
    	//c.setPassword(storepassword);
    	c.setFirstname(fname);
    	c.setLastname(lname);
    	c.setUsername(username);
    	c.setPasswordc(password);
    	int [] sTi=autoGenerateNumber();
    	c.setAccountnumber(removeComma(sTi));
    	c.setIdcustomer(idcustomer);
    	idcustomer++;
    	System.out.println("************************************************************************************");
    	System.out.println("Account had create: ");
    	System.out.println("************************************************************************************");
    	System.out.println();
    	
    	
    	Account classaccount= new Account(c.getAccountnumber(),"Checking"
    			,c.getFirstname()+":"+c.getLastname(),Double.parseDouble(balance),c.getIdcustomer());
    	
    	account.add(classaccount);
    //	System.out.println(account);
    //	System.out.println();
    //	System.out.println(c.toString());
    //	System.out.println();
    //	System.out.println(storepassword.toString());
    	
    	write(fileCustomer, c);
    	write(fileAccount, classaccount);
    	writeObject(filePassword,storepassword);
    	
    	//System.out.println("==========================================================");
    	
    	read("./data/CustomerInformation.txt");
    //	System.out.println("==========================================================");
    //	System.out.println("==========================================================");
    	readObject("./data/PasswordInformation.txt");
    	printScreen();
    	
    	
    	
    }
    
    public static void accountOpen(String user,String pw)
    {
    	
    	
    }
	public static Customer selectCustomer(Customer name) {
		Customer cus = null;
		
		
		return cus;
	}
	public static void accountdeposit() 
	{
		String s;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit to your account");
		s=input.nextLine();
		while(!s.matches("^(\\d{0,10})$"))
		{
			System.out.println("Invalid input. Only Positive Numbers!");
			s= input.nextLine();
			System.out.println();
		}
		totalBalance = tempBalance+Double.parseDouble(s);
		tempTotalBalance=totalBalance;
		System.out.println("Here is your total balance: "+totalBalance);
		
	}
	public static void accountwithdraw() 
	{
		
		String s;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw from account");
		s=input.nextLine();
		while(!s.matches("^(\\d{0,10})$"))
		{
			System.out.println("Invalid input. Only Positive Numbers!");
			s= input.nextLine();
			System.out.println();
		}
		do {
			if(totalBalance<0)
			{
				System.out.println("Insufficient funds");
				System.out.println("Please enter the amount you want to withdraw from account");
				s= input.nextLine();
				totalBalance=tempTotalBalance;
			}
			totalBalance = totalBalance-Double.parseDouble(s);
			
		}while(totalBalance<0);
		System.out.println("Here is your total balance: "+totalBalance);
		
	}
	public static void accountTransfer()
	{
    	Customer cus =null;
    	Account acc=null;
 	
		try(BufferedReader oos = new BufferedReader(new FileReader("./data/CustomerInformation.txt")))
		{
			
			FileReader	fr=new FileReader("./data/AccountInformation.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String sa=null;
			String sc=null;
			while((sc=oos.readLine())!=null  && (sa=br.readLine())!=null  )
			{
				String[] data = sc.split(":");
				String[] data1 = sa.split(":");
				cus = new Customer(data[3],data[5],data[1],data[2],data[4],Integer.parseInt(data[0]));
				acc= new Account(data1[4],data1[3],data1[1]+" "+data1[2],Double.parseDouble(data1[5]),Integer.parseInt(data1[0]));
				//accountObject(acc);
				if(data[3].equals(users) && data[5].equals(pws))
				{

					
					if(cus.getIdcustomer()==acc.getIdAccount())
					{
						System.out.println("************************************************************************************");
						System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
						System.out.println();
						System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),acc.getAccountype(),acc.getAccountnumber(),totalBalance);
						System.out.println("************************************************************************************");
						
						System.out.println("************************************************************************************");
						System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
						System.out.println();
						System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),"Saving",acc.getAccountnumber(),savingAccountNumber);
						System.out.println("************************************************************************************");
							
						
						int n=1;
						Scanner input = new Scanner(System.in);
						System.out.println("Type 1: transfer fund from Checking to Saving");
						System.out.println("Type 2: transfer fund from Saving to Checking");
					    n=input.nextInt();
						if(n==1)
						{
							Scanner input1 = new Scanner(System.in);
							String s;
							System.out.println("Please enter the amount you want to transfer: ");
							s=input1.nextLine();
							do {
								if(totalBalance<0)
								{
									System.out.println("Insufficient funds");
									System.out.println("Please enter the amount you want to transfer:");
									s= input.nextLine();
									totalBalance=tempTotalBalance;
								}
								totalBalance = totalBalance-Double.parseDouble(s);
								savingAccountNumber=Double.parseDouble(s);
								
							}while(totalBalance<0);
							
							System.out.println("************************************************************************************");
							System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
							System.out.println();
							System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),acc.getAccountype(),acc.getAccountnumber(),totalBalance);
							System.out.println("************************************************************************************");
							
							System.out.println("************************************************************************************");
							System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
							System.out.println();
							System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),"Saving",acc.getAccountnumber(),savingAccountNumber);
							System.out.println("************************************************************************************");
							
						}
						else if(n==2)
						{
							Scanner input1 = new Scanner(System.in);
							String s;
							System.out.println("Please enter the amount you want to transfer: ");
							s=input1.nextLine();
							do {
								if(savingAccountNumber<0)
								{
									System.out.println("Insufficient funds");
								}
								savingAccountNumber = savingAccountNumber-Double.parseDouble(s);
								totalBalance= totalBalance+ Double.parseDouble(s);
								
							}while(totalBalance<0);
							
							System.out.println("************************************************************************************");
							System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
							System.out.println();
							System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),acc.getAccountype(),acc.getAccountnumber(),totalBalance);
							System.out.println("************************************************************************************");
							
							System.out.println("************************************************************************************");
							System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
							System.out.println();
							System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),"Saving",acc.getAccountnumber(),savingAccountNumber);
							System.out.println("************************************************************************************");
						}
						
						
					}

				}
				

			}
			

			
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public static Account accountObject(Account n) {
		Account acc = n;
		acc.getBalance();
		
		return acc;
	}
    
    
	public List<Customer> selectAllCustomer() {
		List<Customer> cus = new ArrayList<>();
		

		
		return cus;
	}
	public List<Account> selectAllAccount() {
		List<Account> acc = new ArrayList<>();
		

		
		return acc;
	}
    
    public static void tryLoginUser() {
    	Customer cus =null;
    	Account acc=null;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your user name: ");
    	String user = input.nextLine();
    	System.out.println("Enter your password");
    	String pw = input.nextLine();
    	
		try(BufferedReader oos = new BufferedReader(new FileReader("./data/CustomerInformation.txt")))
		{
			boolean flag=false;
			int count=0;
			FileReader	fr=new FileReader("./data/AccountInformation.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String sa=null;
			String sc=null;
			while((sc=oos.readLine())!=null  && (sa=br.readLine())!=null  )
			{
				String[] data = sc.split(":");
				String[] data1 = sa.split(":");
				cus = new Customer(data[3],data[5],data[1],data[2],data[4],Integer.parseInt(data[0]));
				acc= new Account(data1[4],data1[3],data1[1]+" "+data1[2],Double.parseDouble(data1[5]),Integer.parseInt(data1[0]));
				//accountObject(acc);
				if(data[3].equals(user) && data[5].equals(pw))
				{
					users=user;
					pws=pw;
					System.out.println("you are login to the user Account!");
					flag=true;
					if(cus.getIdcustomer()==acc.getIdAccount())
					{
						System.out.println("************************************************************************************");
						System.out.printf("%2s%25s%25s%25s%n","NAME","ACCOUNT-TYPE","ACCOUNT NUMBER","BALANCE");
						System.out.println();
						System.out.printf("%s%17s%25s%28f%n",cus.getFirstname()+" "+cus.getLastname(),acc.getAccountype(),acc.getAccountnumber(),acc.getBalance());
						 System.out.println("************************************************************************************");
						 tempBalance=acc.getBalance();
						 
						
						

					}

				}
				if(userEmploye.equals(user) && passwordEmploye.equals(pw))
				{
					flag=true;
					if(count==0)
					{
						System.out.println("you are login as an employee Account!");
						count++;
					}
					
					System.out.println(cus);
					System.out.println(acc);
				}
				
				

/*				cus = new Customer(data[3],data[5],data[1],data[2]);
				if(cus.getUsername().equals(user) && cus.getPassword().equals(pw))
				{
					System.out.println("you are login to the user Account!");
				}*/

			}
			if(flag==false)
			{
				System.out.println("fail input");
				printScreen();
			}
			

			
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    	
    	
   
    }
    
    public static void loginUser() 
    {
    	List<String> alist= new ArrayList<String>();
    	int count=0;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter your user name: ");
    	String user = input.nextLine();
    	System.out.println("Enter your password");
    	String pw = input.nextLine();
    	
		try(BufferedReader oos = new BufferedReader(new FileReader("./data/CustomerInformation.txt")))
		{
			FileReader	fr=new FileReader("./data/AccountInformation.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String sa=null;
			String sc=null;
			while((sc=oos.readLine())!=null)
			{
				String[] data = sc.split(":");
/*				if(data[3].equals(user) && data[5].equals(pw))
				{
					System.out.println("You login to user");
					
				}*/
				//List<String> newList = Arrays.asList(data);
				//Collections.addAll(newList, data)
				
/*				List<String> newList = Arrays.asList(data);
				alist.addAll(newList);*/
				
			}
			//System.out.println(alist);
/*			for(int i=0;i<alist.size();i++)
			{
				
				if(count==5)
				{
					ArrayList<String> newList1 = new ArrayList<String>();
					
				}
				
			}*/
		//	System.out.println("fair login");
		//	printScreen();

			//String obj = ois.readLine();
			//System.out.println(obj);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
    	
    }
    
    
    public static int[] autoGenerateNumber() {
    	int[] n = new int [10];
    	Random ran = new Random();
    	for(int i=0;i<10;i++)
    	{
    		n[i]= ran.nextInt(10);
    	}
    	
    	return n;
    }
	public static String removeComma(int[] n)
	{
		String c ="";
		StringBuffer temp = new StringBuffer();
		for(int i=0;i<n.length;i++)
		{
			c =c.valueOf(n[i]);
			temp=temp.append(c);
			
		}
		return temp.toString();
		
	}
	
	public static void writeObject(String filename, Object obj) 
	{
		String newLine= System.getProperty("line.separator");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename,true)))
		{
			oos.writeObject(obj);
			oos.writeBytes(newLine);
			oos.close();
		
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void write(String filename, Object c) 
	{
		try(BufferedWriter oos = new BufferedWriter(new FileWriter(filename,true)))
		{
			PrintWriter out = new PrintWriter(oos);
			out.println(c.toString());
			
			out.close();
			
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public static void readObject(String filename)
	{
		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filename)))
		{
				
				Object obj = oos.readObject();
/*				String s = obj.toString();
				String [] data = s.split(":");
				System.out.println("IDpasword: "+data[0]);
				System.out.println("IDpasword: "+data[1]);*/
				//System.out.println(obj);
			
		
			
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void read(String filename)
	{
		try(BufferedReader oos = new BufferedReader(new FileReader(filename)))
		{
			String s=null;
			while((s=oos.readLine())!=null)
			{
				String[] data = s.split(":");
/*				System.out.println("ID:"+ data[0]);
				System.out.println("firstname: "+ data[1]+" lastname: "+ data[2]);
				System.out.println("username:"+ data[3]);
				System.out.println("account:"+ data[4]);
				System.out.println("----------------------------------------");*/
				
			}
			//String obj = ois.readLine();
			//System.out.println(obj);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    
}
