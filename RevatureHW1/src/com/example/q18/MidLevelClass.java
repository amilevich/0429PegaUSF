package com.example.q18;

import java.util.HashMap;
import java.util.Map;

//Here we define the methods
public class MidLevelClass extends HigherUpClasses {

	@Override
	public boolean CheckforUppercase(String input) {
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean alpha=false;
		for (char x : input.toCharArray()) {
			for (char y : alphabet.toCharArray()) {
				if (x==y) {
					alpha=true;
					break;
					}
			}
		if (alpha) {break;}
			
		}
		return alpha;
	}

	@Override
	public boolean isLowerCase(char y) {
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		boolean alpha=false;
		for (char x : alphabet.toCharArray()) {
			if (x==y) {
				alpha=true;
				break;
				}	
		}
		return alpha;
	}
	
	public String ReturnUpperCase(String input) {
		Map<Character, Character> AlphabetLetters = new HashMap<Character, Character>(26);
		AlphabetLetters.put('a', 'A');
		AlphabetLetters.put('b', 'B');
		AlphabetLetters.put('c', 'C');
		AlphabetLetters.put('d', 'D');
		AlphabetLetters.put('e', 'E');
		AlphabetLetters.put('f', 'F');
		AlphabetLetters.put('g', 'G');
		AlphabetLetters.put('h', 'H');
		AlphabetLetters.put('i', 'I');
		AlphabetLetters.put('j', 'J');
		AlphabetLetters.put('k', 'K');
		AlphabetLetters.put('l', 'L');
		AlphabetLetters.put('m', 'M');
		AlphabetLetters.put('n', 'N');
		AlphabetLetters.put('o', 'O');
		AlphabetLetters.put('p', 'P');
		AlphabetLetters.put('q', 'Q');
		AlphabetLetters.put('r', 'R');
		AlphabetLetters.put('s', 'S');
		AlphabetLetters.put('t', 'T');
		AlphabetLetters.put('u', 'U');
		AlphabetLetters.put('v', 'V');
		AlphabetLetters.put('w', 'W');
		AlphabetLetters.put('x', 'X');
		AlphabetLetters.put('y', 'Y');
		AlphabetLetters.put('z', 'Z');
		char[] alpha=input.toCharArray();
		for (int x=0; x< alpha.length; x++) {
			if (isLowerCase(alpha[x])) {
				alpha[x]=AlphabetLetters.get(alpha[x]);
			}
		}
		String beta=new String(alpha);
		return beta;
	}
	

	@Override
	public int AddTenToString(String input) {
		int alpha;
		try {
		   alpha = Integer.parseInt(input);
		}
		catch (NumberFormatException e)
		{
		   alpha = -10;
		}
		return alpha+10;
		
		}


	}


