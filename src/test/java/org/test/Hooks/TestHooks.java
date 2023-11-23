package org.test.Hooks;

import java.util.Date;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {
	
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println("Start Time =" + d);
	}
	
	@After
	public void startEnd() {
		Date d = new Date();
		System.out.println("End Time = " + d);
	}

}
