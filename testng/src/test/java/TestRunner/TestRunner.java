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

    private ThreadLocal <WebDriver> driver  = new ThreadLocal<>();


    @BeforeMethod
    public void setUp() {
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setWebDriver();
        System.out.println( driverFactory.getDriver() +"-------------------------------------------");
        driver.set(driverFactory.getDriver());
        System.out.println("Inside before method");
        //   System.out.println( driver.get() +"-------------------------------------------");
    }
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @AfterMethod
    public void tear(){
        driver.get().quit();
    }
}
