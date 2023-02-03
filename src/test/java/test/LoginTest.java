package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignUpPage;
import pages.loginPage;


public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
public void setup() {
		
System.setProperty("webdriver.chrome.driver", "/Users/umpengesi/Documents/chromedriver"); 
driver = new ChromeDriver();
driver.get("https://phptravels.net/login");
		
	}
	
	
@Test
public void Login()  {
SignUpPage signUp = new SignUpPage(driver);
loginPage login = new loginPage(driver);		
signUp.enterEmail("usanda.mpengesi@gmail.com"); 
signUp.enterPassword("demoagent"); 
login.clickLogin();
Assert.assertTrue(!driver.findElements(By.id("back-to-top")).isEmpty(), "Test Pass");
//driver.quit();
	}

}