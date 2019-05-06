package com.example.q8;

import java.util.ArrayList;

// “karan”, “madam”, ”tom”, “civic”, “radar”, “sexes”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

public class Main {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("karan");
		words.add("madam");
		words.add("tom");
		words.add("civic");
		words.add("radar");
		words.add("sexes");
		words.add("jimmy");
		words.add("kayak");
		words.add("john");
		words.add("refer");
		words.add("billy");
		words.add("did");
	
	
		ArrayList<StringBuilder> palindromes = new ArrayList<>();
		for (String x : words) {
			StringBuilder p = new StringBuilder(x);
			StringBuilder r = p.reverse();
			StringBuilder q = new StringBuilder(x);
//			System.out.println(p);
//			System.out.println(q);
//			System.out.println(p.toString().equals(r.toString())); //This does not work
//			System.out.println(q.toString().equals(r.toString())); //This works
			if (q.toString().equals(r.toString())) {
				palindromes.add(q);
			}
		}
		System.out.println(words);
		System.out.println(palindromes);
		}
		
		
	}