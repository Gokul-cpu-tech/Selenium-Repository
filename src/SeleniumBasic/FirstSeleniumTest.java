package SeleniumBasic;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
		driver1.get("http://www.google.co.in");
		//driver2.get("http://www.google.co.in");
		
		System.out.print("Page Title:" + driver1.getTitle()  + "from Firefox Browser");
		
		//System.out.print("Page Title:" + driver2.getTitle()  + "from Edge Browser");
		
		driver1.close();
		//driver2.close();	
	}

}
