package TestNgpkg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class amazon {

	ChromeDriver driver;
	WebElement searchbox, searchicon, categorydropdown;
	Select s1;
	SoftAssert sa;
	String productname;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@DataProvider(name = "dataset1")
	public Object[][] getData() {
		return new Object[][] { 
			
			{ "Electronics", "iphone" },
			{ "Amazon Fresh", "salt" },
			{ "Electronics", "oneplus" } 
			
		};

	}

	
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Test Case start");
		driver.get("https://www.amazon.in/");
		searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchicon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		categorydropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		s1 = new Select(categorydropdown);

	}

	@Test(dataProvider = "dataset1")
	public void AmazonSearch(String category, String searchItem) throws InterruptedException {

		s1.selectByVisibleText(category);
		searchbox.sendKeys(searchItem);
		productname = searchItem;
		searchicon.click();
		Thread.sleep(3000);

	}

	/*@AfterMethod
	public void verifyTitle() {

			sa = new SoftAssert();
			sa.assertEquals(driver.getTitle(), "Amazon.in : "+productname);
			Reporter.log("data verified succsfully", true);
		

	}*/

	@AfterTest
	public void afterTest() {

		driver.close();
	}

	
	
}
