package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {

	WebDriver driver;

    public void CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
     
    By sear = By.xpath("//input[@placeholder='Search']");
	By click = By.cssSelector("[class=\"btn btn-default btn-lg\"]");
	By add = By.xpath("//div[@class='button-group']//i[@class='fa fa-shopping-cart']");
	By checkout = By.xpath("//a[@title='Checkout']//i[@class='fa fa-share']");
	By cupon = By.xpath("//a[normalize-space()='Use Coupon Code']");
	By cuponFild = By.xpath("//input[@id='input-coupon']");
	By addCupon = By.xpath("//input[@id='button-coupon']");

    public void SearchItem( String ph) {
        driver.findElement(sear).sendKeys(ph);
    }
    public void SearchButton() {
        driver.findElement(click).click();
    }
    
    public void addToCart() {
        driver.findElement(add).click();
    }

    public void proceedToCheckout() {
        driver.findElement(checkout).click();
    }
    
    public void promoOpt() {
        driver.findElement(cupon).click();
    }
    
    public void applyPromoCode(String promoCode) {
        driver.findElement(cuponFild).sendKeys(promoCode);
        
    }
    public void AddCoupn() {
    	driver.findElement(addCupon).click();
    }
}
