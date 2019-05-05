package com.example.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		//Sets
		
		Set<Integer> hSet = new HashSet<>();
		hSet.add(4);
		hSet.add(42);
		hSet.add(57);
		hSet.add(11);
		hSet.add(23);
		hSet.add(4);
		
		System.out.print(hSet);
		
		//sets and hashset do not guarantee insertion order
		
		// TreeSet
		Set<Integer> tSet = new TreeSet<>();
		tSet.addAll(hSet);
		System.out.print(tSet);
		
		
		
		
	}

}
