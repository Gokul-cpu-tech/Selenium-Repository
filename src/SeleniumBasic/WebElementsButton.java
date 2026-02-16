package SeleniumBasic;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsButton {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://demoqa.com/elements");
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement buttonMenuClk = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item-4\"]/span")));
		buttonMenuClk.click();
		
		// Double Click Mouse Button
		WebElement btnClk1 = driver.findElement(By.id("doubleClickBtn"));
		Actions btnclkactions = new Actions(driver);
		btnclkactions.doubleClick(btnClk1).perform();
		
		//Right Click Mouse Button
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement btnRightClk = wait2.until(ExpectedConditions.elementToBeClickable(By.id("rightClickBtn")));
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", btnRightClk);
		 btnRightClk.click();	
		
		
		//Click Mouse Button
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement btnClk2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"3KR4m\"]")));
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].scrollIntoView(true);", btnClk2);
		 btnClk2.click();	
	
		
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
