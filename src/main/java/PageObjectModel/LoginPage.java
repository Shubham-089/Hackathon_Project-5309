package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

    public void Login_Functionality(WebDriver driver) {
        this.driver = driver;
    }
    By account = By.xpath("//i[@class='fa fa-user']");
	By click_Login = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");
	
    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.cssSelector("input[value='Login']");
   // By errorMessage = By.cssSelector(".alert-danger");
    
    public void Myaccount() {
        driver.findElement(account).click();
    }
    public void LoginClick() {
        driver.findElement(click_Login).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
