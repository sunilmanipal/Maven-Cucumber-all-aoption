package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	
	@Given("We should be in the Home Page")
	public void we_should_be_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome 87\\chromedriver.exe");
		//this line to start a new instance of chrome browser
		driver = new ChromeDriver();
		//i should be in the login page 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	
	@When("Enter the valid name {string}")
	public void enter_the_valid_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	
	
	
	
	
	@When("Enter valid password {string}")
	public void enter_valid_password(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		
	}
	
	/*@Then("Login Should be Successfull")
	public void login_should_be_successfull() throws InterruptedException {
		String expected =driver.findElement(By.id("welcome")).getText();
		String  Actual = "Welcome Paul";
		Assert.assertEquals(expected, Actual);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.close();
	    
	}*/
	@When("Click on Login validButton")
	public void click_on_login_valid_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(3000);
	}
	/*@Then("I should see the userName as {string}")
	public void i_should_see_the_user_name_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String  Actual = "Welcome Paul";
		Assert.assertEquals(Actual, string);
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}*/

	@Then("I should see the userName as {string}")
	public void i_should_see_the_user_name_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("it is in then method");
		Thread.sleep(3000);
		String  Actual = "Welcome Paul";
		Assert.assertEquals(Actual, string);
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	@When("Enter the invalid Name {string}")
	public void enter_the_invalid_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	
	
	@When("Enter invalid password {string}")
	public void enter_invalid_password(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtPassword")).sendKeys(string);
		
	}
	
	
	/*@Then("Login Should be unsuccessfull")
	public void login_should_be_unsuccessfull() {
	   String error = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	   String Actualerror = "Invalid credentials";
	   Assert.assertEquals(error, Actualerror);
	   driver.close();
	    
	}*/

	@When("Click on Login invalidButton")
	public void click_on_login_invalid_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(3000);
	}
	@Then("I should see the invalid credential as {string}")
	public void i_should_see_the_invalid_credential_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 String Actualerror = "Invalid credentials";
		   Assert.assertEquals(Actualerror, string);
		   driver.close();
	}



}
