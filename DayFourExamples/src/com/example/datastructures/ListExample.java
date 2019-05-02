package com.example.datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	
	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<Integer> aList = new ArrayList<>();
		List<Integer> arrList = new ArrayList<>();
		
		arrList.add(3);
		arrList.add(2);
		arrList.add(1);
		arrList.add(13);
		arrList.add(3);
		
		System.out.print(arrList);
		// print out a specific index, 2nd element
		//System.out.println(arrList.get(1));
		//System.out.println(arrList.get(10));
		
		//Iterators
		ListIterator<Integer> lilIter = arrList.listIterator(arrList.size());
		while(lilIter.hasPrevious()) {
			System.out.print(lilIter.previous() + " ");
		}
		
		//Linked List
		LinkedList<Integer> lilList = new LinkedList<>();
		// in a linked list, we have a collection of "nodes"
		// where each node points to the previous and the 
		// next node
		
	}

}