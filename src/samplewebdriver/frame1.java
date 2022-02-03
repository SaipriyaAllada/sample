package samplewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "D:\\QA Testing\\Drivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click();
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("WebDriver")).click();
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]")).click();
       



	}

}
