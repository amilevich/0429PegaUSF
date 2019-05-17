package com.example.log;

import org.apache.log4j.Logger;

public class MainDriver {
	
	final static Logger loggy = Logger.getLogger(MainDriver.class);
	
	public static void main(String[] args) {
		
		loggy.info("this is info");
		loggy.error("message about error", new IndexOutOfBoundsException());
		loggy.fatal("fatal message");
		loggy.warn("warning message");
	}

}
