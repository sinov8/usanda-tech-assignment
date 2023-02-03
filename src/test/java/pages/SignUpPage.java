package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {
          this.driver = driver;
	}
	By accountType = By.xpath("//span[@id='select2-account_type-container']");
	By fname = By.xpath("//input[@name='first_name']");
	By Lname = By.xpath("//input[@name='last_name']");
	By phone = By.xpath("//input[@name='phone']");
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='password']");
	By signUpBTN = By.xpath("//button[@id='button']");
	By agent = By.xpath("//ul[@id='select2-account_type-results']");
	By search = By.xpath("//input[@class='select2-search__field']");
	
	public void enterNama(String name) {
		driver.findElement(fname).sendKeys(name);
	}
	
	public void enterSearch(String account) {
		driver.findElement(search).sendKeys(account);
	}
	
	public void enterSurname(String surname) {
		driver.findElement(Lname).sendKeys(surname);
	}

	public void enterPhone(String phoneNumber) {
		driver.findElement(phone).sendKeys(phoneNumber);
	}
	
	public void enterEmail(String emailAdress) {
		driver.findElement(email).sendKeys(emailAdress);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickSignUpBTN() {
		driver.findElement(signUpBTN).click();
	}
	
	public void clickAccount() {
		driver.findElement(accountType).click();
	}
	
	public void clickAgent() {
		driver.findElement(agent).click();
	}
}
