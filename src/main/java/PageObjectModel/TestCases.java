package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCases {

	WebDriver driver;
	
	 @BeforeClass
	    public void setUp() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	     Thread.sleep(5000);

	   		
	   	}
          // Register
	        @Test
	        public void register() throws InterruptedException {
	        	Registration  rg = new Registration(driver);
			rg.account();
			rg.click_rejister();
			rg.fastName("Shubham ");
			rg.lastName("Patil");
			rg.mail("Nikhil1234@gmail.com");
			rg.ph("8956545953");
			rg.password("Qwerty@123");
			rg.ConPassword("Qwerty@123");
			rg.redio();
			Thread.sleep(3000);
		
	   }
  
          //   valid Login_Functionality
	    @Test(priority = 1)
	    public void testValidLogin() throws InterruptedException {
	    	LoginPage loginPage = new LoginPage();
	    	loginPage.Myaccount();
	    	loginPage.LoginClick();
	        loginPage.enterEmail("Nikhil1234@gmail.com");
	        loginPage.enterPassword("Qwerty@123");
	        loginPage.clickLogin();
	        Thread.sleep(3000);
	    }
    
	    //   Product_Search_And_Filter
	    @Test(priority = 1)
	    public void testSearchProduct() throws InterruptedException {
	    	SearchFunctionality productPage= new SearchFunctionality(); 
	        productPage.searchProduct("iPhone");
//	        Assert.assertTrue(driver.getPageSource().contains("iPhone"), "Search results do not contain the product.");
	        
	       
	        Thread.sleep(200);
	        
	    }
	    // display items
	    @Test
	    public void display() throws InterruptedException {
	    	Display dis=new Display();
	    	dis.dis();
	    	dis.pro();
	    	Thread.sleep(2000);
	    	
	    }
	   
	    //   CheckOut Process
	    @Test
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
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.quit();
	    }
}
