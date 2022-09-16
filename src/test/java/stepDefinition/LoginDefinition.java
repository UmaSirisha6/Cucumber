package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import dependencyInj.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	
	private ApplicationHooks hooks;
	 
    public LoginDefinition(ApplicationHooks hooks) {
 
        this.hooks = hooks;
    }
 
    @Given("User is on Home page")
    public void userOnHomePage() {
 
        System.out.println("Home Page is opened");
    }
 
    @When("User enters username as {string}")
    public void entersUsername(String userName) throws InterruptedException {
 
        System.out.println("Username Entered");
        hooks.getDriver().findElement(By.name("txtUsername")).sendKeys(userName);
 
    }
 
    @When("User enters password as {string}")
    public void entersPassword(String passWord) throws InterruptedException {
 
        System.out.println("Password Entered");
        hooks.getDriver().findElement(By.name("txtPassword")).sendKeys(passWord);
 
        hooks.getDriver().findElement(By.id("btnLogin")).submit();
    }
 
    @Then("User should be able to login sucessfully")
    public void sucessfullLogin() throws InterruptedException {
 
        String newPageText = hooks.getDriver().findElement(By.id("welcome")).getText();
        System.out.println("newPageText :" + newPageText);
        Assert.assertTrue(newPageText.contains("Welcome"));
 
    }

}
