package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1 {
	WebDriver driver;
	@Given("^User opens the application$")
	public void user_opens_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6B.01.16\\Desktop\\Browser drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	}

	@When("^User clicks on signup link$")
	public void user_clicks_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("userName")).sendKeys(arg1);
	}

	@When("^User enters firstname as \"([^\"]*)\"$")
	public void user_enters_firstname_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("firstName")).sendKeys(arg1);
	}

	@When("^User enters lastname as \"([^\"]*)\"$")
	public void user_enters_lastname_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("lastName")).sendKeys(arg1);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("password")).sendKeys(arg1);
	}

	@When("^User enters confirm_password as \"([^\"]*)\"$")
	public void user_enters_confirm_password_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	    driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
	}

	@When("^User enters gender as \"([^\"]*)\"$")
	public void user_enters_gender_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).sendKeys(arg1);
	}
	
	@When("^User enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("emailAddress")).sendKeys(arg1);
	}

	@When("^User enters mobile as (\\d+)$")
	public void user_enters_mobile_as(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
		String abc=Integer.toString(arg1);
		//driver.findElement(By.id("mobileNumber")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    driver.findElement(By.id("mobileNumber")).sendKeys(abc);
	}

	@When("^User enters dob as \"([^\"]*)\"$")
	public void user_enters_dob_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^User enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("address")).sendKeys(arg1);
	}

	@When("^User enters security question as (\\d+)$")
	public void user_enters_security_question_as(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    Select ques=new Select(driver.findElement(By.name("securityQuestion")));
	    ques.selectByIndex(arg1);
	}
	
	@When("^User enters answer as \"([^\"]*)\"$")
	public void user_enters_answer_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("answer")).sendKeys(arg1);
	}

	@Then("^Message displayed signup successful$")
	public void message_displayed_signup_successful() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	    System.out.println("Signup successful");
	}
}
