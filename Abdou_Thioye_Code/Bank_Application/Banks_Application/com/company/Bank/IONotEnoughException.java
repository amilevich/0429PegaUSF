package com.company.Bank;

public class IONotEnoughException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IONotEnoughException(String message)
    {
        super(message);
    }
}
