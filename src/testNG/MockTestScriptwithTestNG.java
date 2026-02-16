package testNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;

public class MockTestScriptwithTestNG {

	@Test
	public void loginTestScript() {
	
	WebDriver driver = new FirefoxDriver(); 
	driver.get("https://demoqa.com/login");
	
	WebElement unameTextbox = driver.findElement(By.id("userName"));
	unameTextbox.sendKeys("testuser");
	
	WebElement passwordTextbox = driver.findElement(By.id("password"));
	passwordTextbox.sendKeys ("Testuser@2026");
	
	WebDriverWait wait  = new WebDriverWait(driver, java.time.Duration.ofSeconds(60));
	WebElement loginBtnClk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login\"]")));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", loginBtnClk);
	loginBtnClk.click();
	
	//WebElement loginBtnClk = driver.findElement(By.id("login"));
	//loginBtnClk.click();
	
	String actualTitle = driver.getTitle();
    String expectedTitle = "Google";
    
	SoftAssert sa = new SoftAssert();
	sa.assertEquals(actualTitle, expectedTitle);
	sa.assertAll();  // mandatory
	
	driver.close();
	}
	
}
