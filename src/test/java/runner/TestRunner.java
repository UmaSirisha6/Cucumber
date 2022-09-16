package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


@RunWith(Cucumber.class)

@CucumberOptions(
  plugin = {"pretty", "html:target/first.html"},
  tags = "@tag",
  features = {"src/test/resources/features/first.feature"}, 
  glue= "stepDefinition")

public class TestRunner extends AbstractTestNGCucumberTests{
 
 @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
}


