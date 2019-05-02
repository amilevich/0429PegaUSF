package com.example.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {

		//HashMap
		// unique keys
		
		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(-3, "Turkey");
		hMap.put(0, "California");
		hMap.put(3, "CarWash");
		hMap.put(null, "Programmer -_-");
		hMap.put(1, "Basement");
		// null can be a key
		// keys must be unique
		// keys are objects
		
//		System.out.println(hMap);
//		System.out.println(hMap.get(1));
//		System.out.println(hMap.get(null));
//		System.out.println(hMap.get(88));
		
		//Loop
		for(Entry<Integer, String> en : hMap.entrySet()) {
			System.out.println(en.getKey() + "\t" + en.getValue());
				
		}
		
		
		
	}

}
