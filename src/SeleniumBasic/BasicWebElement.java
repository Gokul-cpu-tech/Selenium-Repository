package SeleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/elements");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement textBoxMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-0\"]/span")));
		textBoxMenu.click();		
		
		 		 
		WebElement nameTxtbox = driver.findElement(By.id("userName"));
		nameTxtbox.sendKeys("Sample");
		
		 WebElement userMailID = driver.findElement(By.id("userEmail"));
		 userMailID.sendKeys("sample@xyz.com");
		 
		 WebElement address = driver.findElement(By.id("currentAddress"));
		 address.sendKeys("qqq, ttt, 123");
		 
		 
		 WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		 permanentAddress.sendKeys("qqq, ttt, 123");
		 
		 //WebElement submitButton = driver.findElement(By.id("submit"));
		
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
		 WebElement submitBtn = wait1.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
		 submitBtn.click();		
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		 
	}

}
