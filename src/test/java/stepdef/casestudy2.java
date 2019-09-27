package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy2 {
	WebDriver driver;
	@Given("^Users opens the application$")
	public void users_opens_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	}

	@When("^User clicks on signin link$")
	public void user_clicks_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters username as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_as_and(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
	    driver.findElement(By.name("password")).sendKeys(arg2);
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    driver.findElement(By.name("Login")).click();
	}

	@Then("^Message displayed as Login Successful$")
	public void message_displayed_as_Login_Successful() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.close();
		 System.out.println("Login successful");
	}
}