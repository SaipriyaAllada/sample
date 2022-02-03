package samplewebdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		WebElement searchicon = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		
		searchbox.sendKeys("iPhone");
		searchicon.click();
		driver.findElement(By.xpath("//div[@data-index='1']")).click();
		driver.close();
		
	}

}
