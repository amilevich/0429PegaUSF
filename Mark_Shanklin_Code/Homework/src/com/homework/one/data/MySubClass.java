package com.homework.one.data;

public class MySubClass extends MySuperClass {

	@Override
	public boolean isUpper(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String toUpper(String s) {
		return s.toUpperCase();
	}

	@Override
	public void toIntPlusTen(String s) {
		System.out.println(Integer.parseInt(s) + 10);
	}

}
