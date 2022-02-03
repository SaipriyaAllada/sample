package TestNgPkg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNgCls1 {
	ChromeDriver driver ;
	WebElement searchbox,searchicon;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
  }
  
  @Test
  public void f() throws InterruptedException {
	   searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	   searchicon = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		
		searchbox.sendKeys("iPhone");
		searchicon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-index='1']")).click();
		//String expectedTitle ="Apple iPhone XR (64GB) - White : Amazon.in: Electronics";
		//String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle,expectedTitle);
		
  }
 
  @AfterTest
  public void afterTest() {
	  driver.close();
		
  }









}
