package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FligthsPage;
import pages.SignUpPage;
import pages.loginPage;


public class flightsTest {
	WebDriver driver;
			
	@BeforeTest
public void setup() {
		
System.setProperty("webdriver.chrome.driver", "/Users/umpengesi/Documents/chromedriver"); 

driver = new ChromeDriver();
driver.get("https://phptravels.net/flights");
		
	}
	
	
@Test
public void searchFlights()  {
FligthsPage flight= new FligthsPage(driver);

flight.clickRound();
flight.clicklightType();
flight.clickEconomy();
flight.enterFlightFrom("Dubai Int"); 
flight.clickDubai();
flight.enterFlightTo("Kuwait Int"); 
flight.clickKuwait();
flight.clickDateFrom();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
flight.clickDateTo();
flight.clickPassengers();
flight.enterAdults("2"); 
flight.enterChids("1"); 
flight.enterInfants("1"); 
flight.clickSearchP();
Assert.assertTrue(!driver.findElements(By.xpath("//img[@class='mt-2 w-50 h-50 shadow-sm p-3 mb-5 bg-white rounded']")).isEmpty(), "Test Pass");

	}

}