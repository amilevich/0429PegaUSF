package com.example.keywords;

public class Animal {

	// POJO
	// Plain Old Java Object

	private String name;
	private String species;
	private int numberOfLegs;
	
	//what is a constructor?
	// they return an instance of the class
	// do not have a return type
	/*
	 * if no constructor is explicitly provided,
	 * the JVM provides you with a no-argument
	 * constructor by default.
	 * 
	 * first line in any constructor is 
	 * either this() or super()
	 * default is super()
	 */
	
	public Animal() {
	}
	
	public Animal(String name) {
	}
	

	// variables should be private
	// setters - should be public
	// getters - should be public

	public Animal(String name, String species, int numberOfLegs) {
		super();
		this.name = name;
		this.species = species;
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", numberOfLegs=" + numberOfLegs + "]";
	}
	
	/*
	 * access modifiers
	 * - restrict access to variables/methods/etc
	 */
	
	/*
	 * "private" - class itself
	 * default - class itself, package
	 * "protected" - class itself, package, children
	 * "public" - class itself, package, children, everything
	 */
	

}
