package com.example.inheritance;

public class SuperVillain extends SuperHero{

	String alias = "Dirty Dough";
	// shadowing
	// refers to the practice of using two
	// variables with the same name within scopes
	// that overlap.
	// when you do this, the variable with the higher
	// scope is hidden, because the variable with 
	// the lower scope "shadows" it
	
	// from within the child class super.variablename
	// to refer to the parent variable's value
	// (and cast it to the parent class)
	
	public SuperVillain() {
		System.out.println("***In SuperVillain Constructor***");
	}
	
	@Override
	public void alterWeakness() {
		weakness = "dog food";
	}
	
	@Override
	public String getName() {
		return new String();
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
}
