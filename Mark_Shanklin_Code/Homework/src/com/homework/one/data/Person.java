package com.homework.one.data;

public class Person {

	String firstname;
	String lastname;
	String age;
	String state;

	public Person(String firstname, String lastname, String age, String state) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.state = state;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Name: " + firstname+ " " + lastname + "\n" + "Age: " + age + " years\n" + "State: " + state + " State\n";
	}

}
