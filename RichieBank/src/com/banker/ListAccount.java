package com.banker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//The purpose of this function is to create a file where accounts and transactions
//will be stored prior to employee or administrator approval.

public class ListAccount {
	public static void InfoToText(BankAccount JohnDoe) {
	BufferedWriter writer = null;
     try {
         //create a temporary file
    	 String strLong = Long.toString(JohnDoe.getAccount());
         File logFile = new File(strLong);

            // This will output the full path where the file will be written to...
            System.out.println(logFile.getCanonicalPath());

            writer = new BufferedWriter(new FileWriter(logFile));
            writer.write(JohnDoe.getUsername() +':' + JohnDoe.getPassword() +':' +
            		JohnDoe.getfirstName() + ':' + JohnDoe.getlastName()
            		 + ':' + JohnDoe.getAccount() + ':'
            		+ JohnDoe.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
            }
        }
    }
	
	
	}

