package com.hrms.Testscripts;

import com.hrms.lib.General;

public class TC_103 {

	public static void main(String[] args) throws Exception {
	
		General g= new  General();
		
		g.openApplication();
		g.login();
	//	g.deleteEmployee();
		g.logout();
		g.closebrowser();
		
		
		
		
		

	}
}
