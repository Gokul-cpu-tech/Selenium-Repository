package testNG;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RealTimeTestNGSample {

	@Test
	public void googleTitleTest() {

	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://www.google.com");

	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Google";

	    Assert.assertEquals(actualTitle, expectedTitle);

	    driver.quit();
}
	
}
