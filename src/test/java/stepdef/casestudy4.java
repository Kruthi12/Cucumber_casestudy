package stepdef;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {
	WebDriver driver;
	@Given("^Alex has registered into TestMeApp$")
	public void alex_has_registered_into_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("ABCEDF1");
	    driver.findElement(By.name("password")).sendKeys("abcedf1");
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.name("Login")).click();
	}

	@When("^Alex search a particular product$")
	public void alex_search_a_particular_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement search=driver.findElement(By.id("myInput"));
	    Actions act=new Actions(driver);
	    act.sendKeys(search,"carp").perform();
	    Thread.sleep(2000);
	    act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //Thread.sleep(2000);
	}

	@When("^Try to proceed to payment without adding any item in the cart$")
	public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
		driver.findElement(By.linkText("Cart")).click();
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			
			driver.findElement(By.linkText("SignOut")).click();
			System.out.println("Element not found!!");
			//e.printStackTrace();
		}
	}

	@Then("^TestMeApp does'nt display the cart icon$")
	public void testmeapp_does_nt_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
		driver.close();
	}
}