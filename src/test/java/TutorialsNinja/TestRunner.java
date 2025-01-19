package TutorialsNinja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import PageObjectModel.CheckOut;
import PageObjectModel.Display;
import PageObjectModel.LoginPage;
import PageObjectModel.Registration;
import PageObjectModel.SearchFunctionality;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRunner {

WebDriver driver=null;
	
	@Given("set up")
	@BeforeClass
	public void set_up() throws InterruptedException {
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
      Thread.sleep(5000);
	}
	@When("Registration")
		public void register() throws InterruptedException {
        	Registration  rg = new Registration(driver);
		rg.account();
		rg.click_rejister();
		rg.fastName("Shubham");
		rg.lastName("Patil");
		rg.mail("Nikhil1234@gmail.com");
		rg.ph("8956545953");
		rg.password("Qwerty@123");
		rg.ConPassword("Qwerty@123");
		rg.redio();
		Thread.sleep(3000);
	
}
	@When("login")
	public void testValidLogin() throws InterruptedException {
    	LoginPage loginPage = new LoginPage();
    	loginPage.Myaccount();
    	loginPage.LoginClick();
        loginPage.enterEmail("Nikhil1234@gmail.com");
        loginPage.enterPassword("Qwerty@123");
        loginPage.clickLogin();
        Thread.sleep(3000);
    }
	@Then(" check Product is display")
	public void display() throws InterruptedException {
    	Display dis=new Display();
    	dis.dis();
    	dis.pro();
    	Thread.sleep(2000);
    	
    }
	@Then(" check search functionality")
	public void testSearchProduct() throws InterruptedException {
		SearchFunctionality  productPage= new SearchFunctionality (); 
        productPage.searchProduct("iPhone");
        
    }
	@Then("CheckOut product")
	public void testAddToCart() throws InterruptedException {
    	
    	CheckOut sea = new CheckOut();
    		sea.SearchItem("iphone");
    		sea.SearchButton();
    		sea.addToCart();
    		sea.proceedToCheckout();
    		sea.promoOpt();
    		sea.applyPromoCode("HAIR20");
    		sea.AddCoupn();
    		Thread.sleep(2000);
    		driver.quit();
		Thread.sleep(2000);
	}
		
	@AfterClass
	@Then("quit the driver")
    public void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }
}
