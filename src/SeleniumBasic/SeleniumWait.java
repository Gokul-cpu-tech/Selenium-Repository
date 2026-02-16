package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class SeleniumWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement waitElement =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"APjFqb\"]")));
		waitElement.sendKeys("Selenium Explicit Wait");
		
		
		driver.close();
		
		
	}

}
