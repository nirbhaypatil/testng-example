package TestRunner;


import ThreadLocalUsageSelenium.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

@CucumberOptions(
                    features ="src/test/java/resources/",
                    glue = {"steps"},
                    plugin = {"pretty","summary"},
                    monochrome = true
                )
public class TestRunner extends AbstractTestNGCucumberTests {

    DriverFactory driverFactory;

    @BeforeMethod
    public void setUp() {
        DriverFactory.setDriver();
        System.out.println("Inside before method");
    }
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @AfterMethod
    public void tear(){
        DriverFactory.getDriver().close();
    }
}
