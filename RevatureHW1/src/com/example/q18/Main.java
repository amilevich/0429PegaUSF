package com.example.q18;


public class Main{
	public static void main(String[] args) {
		String Testing="1234";
		MidLevelClass obj = new MidLevelClass();
		System.out.println(obj.AddTenToString(Testing));
		
		String Testing1="CHECKFORUPPERCASE";
		if (obj.CheckforUppercase(Testing1)){
			System.out.println("Bazinga!");
		}
		
		String Testing2="checkforuppercase";
		System.out.println(obj.ReturnUpperCase(Testing2));
	}
}
