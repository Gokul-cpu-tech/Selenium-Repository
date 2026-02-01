package SeleniumBasic;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Browser

		//System.setProperty("webdriver.chrome.driver", "C:\\Eclipse Java Selenium Training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		WebElement searchText = driver.findElement(By.id("APjFqb"));
		searchText.sendKeys("India");
		
		//WebElement clearText = driver.findElement(By.id("APjFqb"));
		//clearText.clear();		
		//driver.close();
		//driver.quit();	
		}
	

}
