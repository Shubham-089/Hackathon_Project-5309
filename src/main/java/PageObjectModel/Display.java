package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Display {

WebDriver driver;
	
	public void display1(WebDriver driver) {
		this.driver = driver;
	}
	
	//locator
	By displ = By.xpath("//a[normalize-space()='Qafox.com']");
	By product = By.xpath("//img[@title='MacBook']");
	
	public void dis() {
		driver.findElement(displ).click();
	}
	
	public void pro() {
	
		WebElement prodc = driver.findElement(product);
		if(prodc.isDisplayed()) {
			System.out.println("Product is disply");
		}else {
			System.out.println("Product is Not disply");
		}
	}
}
