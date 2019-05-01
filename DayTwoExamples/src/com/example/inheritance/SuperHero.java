package com.example.inheritance;

public class SuperHero {

	String ability = "Flying";
	String name = "Thozorh";
	String alias = "Luke the FryCook";
	String weakness = "Spaghetti Code";
	
	public SuperHero() {
		System.out.println("***In SuperHero Constructor***");
	}
	
	public SuperHero(String a) {
		System.out.println("***In "
				+ "SuperHero constructor(String)");
		
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	
	public void alterWeakness() {
		weakness = "Bananasz";
	}
	
	
}
