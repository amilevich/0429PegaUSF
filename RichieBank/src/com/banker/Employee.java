package com.banker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Employee {
	
	
	
	private String username;
	private String password;
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



        /*
         * Use BufferReader to get the input data file, and then turn each of the bufferObjects into its lines
         */
   public static String ObtainEmpPassword(String username)
        {    
            String inputUser;
            StringTokenizer tokenObject = null;
            String PassWord=null;

            
            try ( BufferedReader bufferObject = new BufferedReader(new FileReader("Employee/UsernamePasswordsAccounts.txt")) ){
                while( (inputUser = bufferObject.readLine()) != null ){
                    tokenObject = new StringTokenizer(inputUser, ":"); //This separates the text with every instance of a ':'
                    inputUser = tokenObject.nextToken();
                    	
                    if(username.contentEquals(inputUser)) {
                    	PassWord=tokenObject.nextToken();
                   
                    }
                    
                }
                return PassWord;
            }
            catch(FileNotFoundException e){}
            catch(IOException e){}
            catch(NoSuchElementException e) {}
            catch(Exception e) {}
			return PassWord;
        }
 
    
    

public static boolean validEmp(String userinput) {
	 String newString;
     StringTokenizer tokenObject = null;
     boolean output=false;
     
     try ( BufferedReader bufferObject = new BufferedReader(new FileReader("Employee/UsernamePasswordsAccounts.txt")) ){
         while( (newString = bufferObject.readLine()) != null ){
             tokenObject = new StringTokenizer(newString, ":"); //This separates the text with every instance of a ':'
             newString = tokenObject.nextToken();
             if(newString.contentEquals(userinput)) {
             	output=true;
             }
             
         }
         return output;
     }
     catch(FileNotFoundException e){}
     catch(IOException e){}
     catch(NoSuchElementException e) {}
     catch(Exception e) {}
		return output;
 }

public static void main(String [] args) {
	System.out.println(validEmp("Alex"));
	System.out.println(ObtainEmpPassword("Alex"));
}
}



