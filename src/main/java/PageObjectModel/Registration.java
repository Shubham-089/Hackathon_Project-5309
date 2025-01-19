package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {

	WebDriver driver;
	public Registration(WebDriver driver) {
	this.driver = driver;
		
	}
	By account = By.xpath("//i[@class='fa fa-user']");
	By click_rejister = By.xpath("//a[normalize-space()='Register']");
	By fastName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By ph = By.id("input-telephone");
	By password = By.id("input-password");
	By ConPassword = By.id("input-confirm");
	By Redio = By.xpath("//input[@name='agree']");
	
	
	
	public void account () {
		driver.findElement(account).click();
	}
	public void click_rejister () {
		driver.findElement(click_rejister).click();
	}
	
	public void fastName (String name ) {
		driver.findElement(fastName).sendKeys(name);
	}
	
	public void lastName (String lastname ) {
		driver.findElement(lastName).sendKeys(lastname);
	}

	public void mail (String mail ) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void ph (String phone ) {
		driver.findElement(ph).sendKeys(phone);
	}
	
	public void password (String password1  ) {
		driver.findElement(password).sendKeys(password1);
	}
	
	public void ConPassword (String password2  ) {
		driver.findElement(ConPassword).sendKeys(password2);
	}
	

	public void redio () {
		driver.findElement(Redio);

}
}
