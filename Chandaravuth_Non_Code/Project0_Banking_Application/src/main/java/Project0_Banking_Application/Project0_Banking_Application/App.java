package Project0_Banking_Application.Project0_Banking_Application;

import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class App 
{
	static int idcustomer=0;
    public static void main( String[] args )
    {
    	
    	printScreen();
    }
    
    public static void printScreen() {
        Scanner input = new Scanner(System.in); 
        System.out.println("****************************************");
        System.out.println("Type 1: to login to your account");
        System.out.println("Type 2: to register new account");
        System.out.print("Enter: ");
        int enter = input.nextInt();
        switchCase(enter);
        System.out.println("****************************************");
    }
    
    
    public static void switchCase(int n)
    {
    	switch(n)
    	{
    	case 1:
    		loginUser();
    		break;
    	case 2:	
    		
    		Validation.validNewAccount();
    		
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
    	c.setAccountnumber(autoGenerateNumber());
    	c.setIdcustomer(idcustomer);
    	idcustomer++;
    	System.out.println("****************************************");
    	System.out.println("Account had create: ");
    	System.out.println("****************************************");
    	System.out.println();
    	
    	
    	Account classaccount= new Account(removeComma(c.getAccountnumber()),"Checking"
    			,c.getFirstname()+":"+c.getLastname(),Double.parseDouble(balance),c.getIdcustomer());
    	
    	account.add(classaccount);
    	System.out.println(account);
    	System.out.println();
    	System.out.println(c.toString());
    	System.out.println();
    	System.out.println(storepassword.toString());
    	
    	write(fileCustomer, c);
    	write(fileAccount, classaccount);
    	writeObject(filePassword,storepassword);
    	
    	System.out.println("==========================================================");
    	
    	read("./data/CustomerInformation.txt");
    	System.out.println("==========================================================");
    	System.out.println("==========================================================");
    	readObject("./data/PasswordInformation.txt");
    	printScreen();
    	
    	
    	
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
				if(data[3].equals(user) && data[5].equals(pw))
				{
					System.out.println("You login to user");
				}
		
				
/*				List<String> newList = Arrays.asList(data);
				alist.addAll(newList);*/
				
			}
/*			for(int i=0;i<alist.size();i++)
			{
				
				if(count==5)
				{
					ArrayList<String> newList1 = new ArrayList<String>();
					
				}
				
			}*/
			System.out.println("fair login");
			printScreen();

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
				System.out.println(obj);
			
		
			
			
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
				System.out.println("ID:"+ data[0]);
				System.out.println("firstname: "+ data[1]+" lastname: "+ data[2]);
				System.out.println("username:"+ data[3]);
				System.out.println("account:"+ data[4]);
				System.out.println("----------------------------------------");
				
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
