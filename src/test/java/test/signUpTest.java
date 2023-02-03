package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignUpPage;


public class signUpTest {
	WebDriver driver;
	
	@BeforeTest
public void setup() {
		
System.setProperty("webdriver.chrome.driver", "/Users/umpengesi/Documents/chromedriver"); 
driver = new ChromeDriver();
driver.get("https://phptravels.net/signup");
		
	}
	
	
@Test
public void addCart()  {
SignUpPage signUp = new SignUpPage(driver);
		
signUp.enterNama("Usanda");	   
signUp.enterSurname("Mpengesi"); 
signUp.enterPhone("0783616439");
signUp.enterEmail("usanda@gmail.com"); 
signUp.enterPassword("P@ssw0rd297"); 
signUp.clickAccount();
signUp.enterSearch("agent");
signUp.clickAgent();
signUp.clickSignUpBTN();

driver.quit();
	}

}