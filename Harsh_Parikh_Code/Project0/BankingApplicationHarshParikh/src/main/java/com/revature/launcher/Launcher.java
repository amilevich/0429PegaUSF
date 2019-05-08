package com.revature.launcher;

import org.apache.log4j.Logger;

import com.revature.screens.Screen;
import com.revature.screens.StartScreen;

public class Launcher {
	private static Logger log = Logger.getRootLogger();
	public static void main(String[] args) throws InterruptedException {
		log.trace("trace log");
		log.debug("debug log");
		log.info("info log");
		log.warn("warn log");
		log.error("error log");
		log.fatal("fatal log");
		Thread.sleep(2000);
		System.out.println("Welcome to Harsh Funds, we strive to make your life easy");
		Screen s = new StartScreen();
		while(true) {
			s = s.start();
		}

	}

}
