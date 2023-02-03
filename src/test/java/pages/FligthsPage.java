package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class FligthsPage{

		WebDriver driver;

		public FligthsPage(WebDriver driver) {
	          this.driver = driver;
		}
		By flightType = By.xpath("//select[@id='flight_type']");
		By economy_premium = By.xpath("//option[@value='economy_premium']");
		By from = By.xpath("//input[@id='autocomplete']");
		By toDestination = By.xpath("//input[@id='autocomplete2']");
		By date = By.xpath("//input[@id='departure']");
		By startDate = By.xpath("(//td[text()='17'])[1]");
		By endDate = By.xpath("(//td[text()='24'])[2]");
		By round = By.xpath("//input[@id='round-trip']");
		By date2 = By.xpath("//input[@id='return']");
		By passengers = By.xpath("//a[@class='dropdown-toggle dropdown-btn waves-effect']");
		By adults = By.xpath("//input[@id='fadults']");
		By childs = By.xpath("//input[@id='fchilds']");
		By infants = By.xpath("//input[@id='finfant']");
		By searchBTNN = By.xpath("//button[@id='flights-search']");
		By dubai = By.xpath("//strong[text()=' Dubai Intl']");
		By Kuwait = By.xpath("//strong[text()=' Kuwait Intl']");
		
		
		public void clickRound() {
			driver.findElement(round).click();
		}
		
		public void clicklightType() {
			driver.findElement(flightType).click();
		}
		
		public void clickDubai() {
			driver.findElement(dubai).click();
		}
		
		public void clickKuwait() {
			driver.findElement(Kuwait).click();
		}
		
		public void clickEconomy() {
			driver.findElement(economy_premium).click();
		}
		
		public void enterFlightFrom(String ffrom) {
			driver.findElement(from).sendKeys(ffrom);
		}
		
		public void enterFlightTo(String toD) {
			driver.findElement(toDestination).sendKeys(toD);
		}
		
		
		public void clickDateFrom() {
			driver.findElement(date).click();
			driver.findElement(startDate).click();
		}
		
		public void clickDateTo() {
			//driver.findElement(date2).click();
			driver.findElement(endDate).click();
		}
		
		public void clickPassengers() {
			driver.findElement(passengers).click();
		}
		
		
		
		public void enterAdults(String adultsE) {
			driver.findElement(adults).clear();
			driver.findElement(adults).sendKeys(adultsE);
		}
		
		public void enterChids(String childsE) {
			driver.findElement(childs).clear();
			driver.findElement(childs).sendKeys(childsE);
		}
		
		public void enterInfants(String infantsE) {
			driver.findElement(infants).clear();
			driver.findElement(infants).sendKeys(infantsE);
		}
		
		public void clickSearchP() {
			driver.findElement(searchBTNN).click();
		}
		
	}
