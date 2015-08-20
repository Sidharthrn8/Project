import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestClass {
	 public String Baseurl = "https://www.google.co.in/?gws_rd=ssl";
	 public WebDriver driver;
	 
		
		@BeforeTest
		public void testlog(){
			driver = new FirefoxDriver();
			driver.get(Baseurl);
			
		}
		@Test
		public void testcheck(){
			String Expected= "Google";
			String Actual= driver.getTitle();
			Assert.assertEquals(Expected, Actual);
			
			
		}
		@AfterTest
		public void testend(){
			
			driver.quit();
			
}
}
