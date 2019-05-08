package com.example.serialization;

import java.io.Serializable;

public class Salmon implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3213687703637071835L;
	/*
	 * SerialVersionUID
	 * represents your class's version
	 * 
	 * The serialization runtime associates a version number
	 * with each Serializable class.
	 * It is used during deserialization to verify that the sender
	 * and receiver of serialized object have loaded the class
	 * for that object which is compatible with respect to 
	 * serialization.
	 * 
	 * If we have a different UID for sender/receiver,
	 * then we get an InvalidClassException
	 * 
	 */

	private boolean scales;
	private String name;
	private String color;
	private transient double weight;

	public Salmon() {
	}

	public boolean isScales() {
		return scales;
	}

	public void setScales(boolean scales) {
		this.scales = scales;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Salmon [scales=" + scales + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

	public Salmon(boolean scales, String name, String color, double weight) {
		super();
		this.scales = scales;
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	

}
