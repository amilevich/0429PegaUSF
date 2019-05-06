package com.questions.q11a;
/**
 * This class demonstrates how access to private variables from another package in the 
 * project can be controlled using methods "get" and "set". Our main driver will
 * not be able to access the variables directly, but will be able to modify and
 * obtain their values utilizing the public methods of this class.
 * @author Audge
 *
 */
public class FloatVariables {
	private float one;
	private float two;
	
	public float getOne() {
		return one;
	}
	public void setOne(float one) {
		this.one = one;
	}
	public float getTwo() {
		return two;
	}
	public void setTwo(float two) {
		this.two = two;
	}
	
}
