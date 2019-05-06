package com.homework.question18;

public class NewClass extends AbstractClass {
	
	//the string is created
	public NewClass(String str) {
		
		this.str = str;
		
	}
	
	//this method checks for lowercase letters
	@Override
	public boolean upperCase() {
		
		String lowerCase = str.toLowerCase();
		
		//if lowercase letters are found, then it is equal to the string
		boolean isEqual = lowerCase.equals(str);
		
		if(isEqual) {
			return false;
		} else {
			return true;
		}
	}
	
	//this method converts all lowercase letters to uppercase letters
	@Override
	public String upperConvert() {
		return str.toUpperCase();
	}
	
	//this method adds 10 to the string, converting it to an int
	@Override
	public int intConvert() {
	
		int number = 10;
		
		for(int i = 0; i < str.length(); i++) {
			
			number = number + (int)str.charAt(i);
		}
		
		return number;
		
	}

}
