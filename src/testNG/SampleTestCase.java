package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void firstTestCase (){
		System.out.println("This is first Test Case");
	}

	@Test
	public void secondTestCase (){
		System.out.println("This is second Test Case");
	}
	@BeforeMethod
	public void setup() {
        System.out.println("Browser Launched");
    }

    @Test
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Browser Closed");
    }
}
