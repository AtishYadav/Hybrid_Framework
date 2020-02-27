package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_104 {

	//
	//public static void main(String[] args) throws Exception {
	@Test
	public void tc_104() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
	
		General g = new General();
		g.openApplication();
		g.verifyTitle();
		g.login();
        g.verifytext();
		g.logout();
		g.closebrowser();
	}

}
