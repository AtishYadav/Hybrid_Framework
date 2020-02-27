package com.hrms.Testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_105 {

	//public static void main(String[] args) throws Exception {
	@Test
	
      public void tc_105() throws Exception {
	
		DOMConfigurator.configure("log4j.xml");
		
		General g =new General();
		g.openApplication();
		g.login();
		g.mouseover();
		g.Enterfrmae();
		g.Waitstatement();
		g.addEmployee();
		g.Exitframe();
		g.logout();
		g.closebrowser();
		
		
	}

}