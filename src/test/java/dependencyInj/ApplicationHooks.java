package dependencyInj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	private WebDriver driver;
	 
    @Before
    public void setUp() {
        setDriver();
    }
 
    public void setDriver() {
 
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
 
    public WebDriver getDriver() {
        return driver;
    }
 
    @After
    public void tearDown() {
        getDriver().quit();
    }
}
