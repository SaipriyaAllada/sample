package samplewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.jodah.failsafe.internal.util.Assert;

 class AutomationTest1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	WebElement username= driver.findElement(By.name("txtUsername"));
	username.sendKeys("Admin");
	WebElement password= driver.findElement(By.name("txtPassword"));
	password.sendKeys("admin123");
	WebElement login= driver.findElement(By.id("btnLogin"));
	login.click();
	WebElement Admin= driver.findElement(By.id("menu_admin_viewAdminModule"));
	Admin.click();
	WebElement name= driver.findElement(By.id("searchSystemUser_userName"));
	name.sendKeys("adash");
	
	WebElement category= driver.findElement(By.id("searchSystemUser_userType"));
	Select s1 = new Select(category);
	s1.selectByValue("2");
	WebElement emp= driver.findElement(By.id("searchSystemUser_employeeName_empName"));
	emp.sendKeys("adash");
	WebElement category1= driver.findElement(By.id("searchSystemUser_status"));
	Select s2 = new Select(category1);
	s2.selectByValue("1");
	 driver.findElement(By.xpath(" //input[@id='searchBtn']")).click();
	driver.close();

	    
	    	   
	
	}

}
