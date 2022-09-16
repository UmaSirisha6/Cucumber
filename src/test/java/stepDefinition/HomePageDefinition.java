package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import dependencyInj.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageDefinition {

	ApplicationHooks hooks;
	 
    public HomePageDefinition(ApplicationHooks hooks) {
        this.hooks = hooks;
    }
 
    @Given("User Navigates to HRM login page")
    public void userOnHomePage() {
 
        System.out.println("HRM login Page is opened");
    }
 
    @Given("User login with valid credentials")
    public void entersCredentials() throws InterruptedException {
 
        hooks.getDriver().findElement(By.name("txtUsername")).sendKeys("Admin");
    hooks.getDriver().findElement(By.name("txtPassword")).sendKeys("admin123");
        hooks.getDriver().findElement(By.id("btnLogin")).submit();
 
    }
 
    @When("User is in Dashboard page")
    public void verifyDashboardPage() {
 
        String dashboardTitle = hooks.getDriver().findElement(By.id("welcome")).getText();
        Assert.assertTrue(dashboardTitle.contains("Welcome"));
 
    }
 
    @Then("there are valid QuickLaunch options {string}")
    public void verifyQuickLinks(String options) throws InterruptedException {
   
        if(options.equalsIgnoreCase("Assign Leave"))
            {	
            String linkOne = hooks.getDriver()
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[1]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkOne, options);
            }
        	if(options.equalsIgnoreCase("Leave List "))
            {	
        	
            String linkTwo = hooks.getDriver()
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[2]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkTwo, options);
            Thread.sleep(1000);
            }
        	
        	if(options.equalsIgnoreCase("Timesheets"))
            {		
            String linkThree = hooks.getDriver()
                    .findElement(By.xpath(
                            "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div/a/span"))
                    .getText();
            Assert.assertEquals(linkThree, options);
            }
        }
 
 
 
    @Then("there are valid Legend options {string}")
    public void verifyMenuOptions(String options) throws InterruptedException {
 
    //    switch (options) {
        if(options.equalsIgnoreCase("Not assigned to Subunits"))
        {
            String linkOne = hooks.getDriver()
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[1]/td[2]"))
                    .getText();
            Assert.assertEquals(linkOne, options);
        }
 
      
        	if(options.equalsIgnoreCase("Administration"))
            {
            String linkTwo = hooks.getDriver()
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[2]/td[2]"))
                    .getText();
            Assert.assertEquals(linkTwo, options);
            }
        	
        	if(options.equalsIgnoreCase("Client Services"))
            {
            String linkThree = hooks.getDriver()
                    .findElement(
                            By.xpath("//*[@id='div_legend_pim_employee_distribution_legend']/table/tbody/tr[3]/td[2]"))
                    .getText();
            Assert.assertEquals(linkThree, options);
            }
 
        }
    }

