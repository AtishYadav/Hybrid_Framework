package com.hrms.lib;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {
	
	public void openApplication(){
		//System.setProperty("webdriver.chrome.driver", "‪E:\\Atish_Framework\\Drivers\\chromedriver_win32 (2)\\chromedriver.exe‪");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		Log.info("Open Applicatuion");
	}
	
	public void closebrowser() {
		driver.quit();
		Log.info("Close Browser");
	}
	
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(login_btn)).click();
		Thread.sleep(3000);
		Log.info("Login");
		
	}
	public void addEmployee() throws Exception {	
	//	driver.findElement(By.xpath("//input[@type='button'] [@value='Add']")).click();
		driver.findElement(By.id(last_name)).sendKeys(lname);
		Thread.sleep(2000);
		driver.findElement(By.name(first_name)).sendKeys(fname);
		Thread.sleep(2000);
		driver.findElement(By.id(save_btn)).click();
		Thread.sleep(3000);
		Log.info("Add Employee");
			}
	
    //  public   void deleteEmployee() throws Exception {
		
		
	//	driver.findElement(By.xpath("//input[@type='checkbox'][@value='0003']")).click();
		
		//driver.findElement(By.xpath("//input[@type='button'][@value='Delete']")).click();
		
	//	assertTrue(driver.findElement(By.xpath("//span[text()='Successfully Deleted']"))).
		                                                                                                                                                                                                                       
		//assertTrue(driver.findElement(By.xpath("//span[text()='Successfully Deleted']")).getText().matches("Successfully Deleted"));
		
		
	//}

	public void verifyTitle() {
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
           System.out.println("Title Matched");
         	}
		else {
		     System.out.println("Title Not Matched & expected title is::"+driver.getTitle());	
		}
		Log.info("Verify Title");
	}
	public void verifytext() {
		
	
		assertTrue(driver.findElement(By.xpath(verify_text)).getText().equals("Welcome admin"));
		System.out.println("Verify Text");
		Log.info("Verify Text");
	}
	
	  public void mouseover() {
		  Actions action=new Actions(driver);
		  WebElement element =driver.findElement(By.linkText("PIM"));
		  action.moveToElement(element).build().perform();
		  
	  driver.findElement(By.linkText("Add Employee")).click();
		  
	  Log.info("MouseHover Add Employee");
	  }
	 public void Enterfrmae(){
		 
		 driver.switchTo().frame("rightMenu");
		 
		 Log.info("Enter frame");
		  }
	 public void Exitframe() {
		driver.switchTo().defaultContent();
		Log.info("Exit Frame");
		
	       }
	  public void DeleteEmployee() {
		  
		  driver.findElement(By.linkText("Employee List")).click();
		  Log.info("Delete Employee");
	  }
	  
	  
	  public void Selectclass() {
		  Select select=new Select(driver.findElement(By.id("loc_code")));
		 driver.findElement(By.id("loc_name")).sendKeys(Employid);
		 driver.findElement(By.xpath("searchclick")).click();
		 driver.findElement(By.name(checkbox)).click();
		 driver.findElement(By.xpath(delete_btn)).click();
		 Log.info("Select Class");
	  }
	
	   public void logout() {
		 driver.findElement(By.linkText(link_logout)).click();
		 Log.info("Logout");
		
	}  
	 public void Waitstatement() throws Exception {
		 Thread.sleep(3000);
		 Log.info("Wait Statement");
	 }
	
	
	
	

}
