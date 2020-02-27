package com.hrms.lib;


import org.openqa.selenium.WebDriver;

public class Global {
	
//     ========================	Variable Info=========================
	
	public WebDriver driver =null;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String lname="Atish";
	public String fname="enfield";
//	public String title="OrangeHRM - New Level of HR Management";
	public String Employid="0001";
	
//       ============================= Object Info========================	
	
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String login_btn="Submit";
	public String link_logout="Logout";
	public String add_btn="//input[@type='button'][@value='Add']";
	public String last_name="txtEmpLastName";
	public String first_name="txtEmpFirstName";
    public String save_btn="btnEdit";
	//public String Pimlink="PIM";
    public String verify_text="//ul[@id='option-menu']/li[1]";
    public String Employeelist="Employee List";
    public String selectid="loc_code";
 	public String addemployee="Add Employee";
    public String searchfor="loc_name";	
    public String searchclick="//input[@type='button'][@value='Search']";
    public String checkbox="chkLocID[]";
    public String delete_btn="//input[@type='button'][@value='Delete']";
	
	
	
	
	
	
	

}
