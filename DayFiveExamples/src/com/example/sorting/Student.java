package com.example.sorting;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	
	private int studentId;
	private String name;
	private LocalDate dob;
	private double gpa;
	private int numberOfLegs;
	
	public Student() {
	}

	public Student(int studentId, String name, LocalDate dob, double gpa, int numberOfLegs) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dob = dob;
		this.gpa = gpa;
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", gpa=" + gpa
				+ ", numberOfLegs=" + numberOfLegs + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public int compareTo(Student o) {
		return this.getStudentId()-o.getStudentId();
	}
	
	

}
