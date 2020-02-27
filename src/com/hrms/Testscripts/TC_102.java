package com.hrms.Testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_102 {
//public static void main(String[] args) throws Exception {
	
	   @Test 
	public void TC_102() throws Exception {
	
	   
		General g= new General();
		g.openApplication();
		g.login();
		g.Waitstatement();
		g.Enterfrmae();
		g.addEmployee();
		g.Exitframe(); 
		g.logout();
		g.closebrowser();
		
		
		
	}
	

	
	
	
	

}
