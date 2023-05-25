package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	
	WebDriver driver;

	@Given("open browser")
	public void open_browser() {
		
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@When("enter (.*) and (.*)$")
	public void enter_email_and_password(String username , String password) {
		
		WebElement email = driver.findElement(By.id("user-name"));
		email.sendKeys(username);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
		
	}
	
	@When("click login btn")
	public void click_login_btn() {
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		btn.click();
		
	}
	
	@Then("open homepage")
	public void open_homepage() {
		System.out.println("homepage");
		
	}
}
