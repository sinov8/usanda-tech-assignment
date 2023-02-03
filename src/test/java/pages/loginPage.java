package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;

	public loginPage(WebDriver driver) {
          this.driver = driver;
	}
	By loginBTN = By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']");
;
	
	public void clickLogin() {
		driver.findElement(loginBTN).click();
	}
}
