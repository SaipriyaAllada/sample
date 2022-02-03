package TestNgPkg2;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;;

public class OrangeSite {
	ChromeDriver driver;
//	WebElement username,password,login, Admin, name,category,emp,category1;
	Select s1;
	Select s2;
	
	@BeforeTest
		public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	@Test
	public void f1() {
		WebElement username = driver.findElement(By.name("txtUsername"));
		WebElement password = driver.findElement(By.name("txtPassword"));
		WebElement login = driver.findElement(By.id("btnLogin"));

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Admin.click();
		WebElement name = driver.findElement(By.id("searchSystemUser_userName"));
		name.sendKeys("adash");
		WebElement category = driver.findElement(By.id("searchSystemUser_userType"));
		s1 = new Select(category);
		s1.selectByValue("2");
		WebElement emp = driver.findElement(By.id("searchSystemUser_employeeName_empName"));
		emp.sendKeys("adash");
		WebElement category1 = driver.findElement(By.id("searchSystemUser_status"));
		s2 = new Select(category1);
		s2.selectByValue("1");
		driver.findElement(By.xpath(" //input[@id='searchBtn']")).click();
	
		
		}
	
	
	
}
