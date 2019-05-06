package com.example.q19;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		//Nothin too fancy about generating the 1 thru 10 ArrayList
		ArrayList<Integer> OneThruTen = new ArrayList<Integer>(10);
		for (int x=1; x<=10; x++) {
			OneThruTen.add(x);
		}
		
		System.out.println(OneThruTen);
		
		System.out.println(AddEvens(OneThruTen));
		
		System.out.println(AddOdds(OneThruTen));
		
		RemovethePrimes(OneThruTen);
		System.out.println(OneThruTen);

	}

	//Here are the add Evens and addOdds, which are self explanatory
	public static int AddOdds(ArrayList<Integer> OneThruTen) {
		
		int alsum=0;
		for (int x : OneThruTen) {
			if((x%2)==1) {alsum=alsum+x;}
		}
		return alsum;	}

	public static int AddEvens(ArrayList<Integer> OneThruTen) {
		int alsum=0;
		for (int x : OneThruTen) {
			if((x%2)==0) {alsum=alsum+x;}
		}
		return alsum;
	
	}
	
	//Here I use the code from a previous prime problem but modify it so that the number tested is
	//element of an arraylist called in the for loop statement by index value x.
	
	public static void RemovethePrimes(ArrayList<Integer> OneThruTen) {
		for(int x=0; x < OneThruTen.size(); x++) {
			if (OneThruTen.get(x)==2) {OneThruTen.remove(x);}
			if (OneThruTen.get(x)==3) {OneThruTen.remove(x);}
			int y = 2;
			if (OneThruTen.get(x)>3) {
				while (y<OneThruTen.get(x)) {
					int z=OneThruTen.get(x)%y;
					if(z==0) {
						break;
					}
					y=y+1;
					if(y==(OneThruTen.get(x)/2)) {
						OneThruTen.remove(x);
						} 
			
					
					}
				}
			}
		
	}

}
