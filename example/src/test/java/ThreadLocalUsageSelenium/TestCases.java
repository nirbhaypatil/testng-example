package ThreadLocalUsageSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class TestCases {


    private ThreadLocal <WebDriver> driver  = new ThreadLocal<>();

    @BeforeMethod
    public void setUpBrowser(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setWebDriver();
        System.out.println( driverFactory.getDriver() +"-------------------------------------------");
        driver.set(driverFactory.getDriver());


        System.out.println("Inside before method");
     //   System.out.println( driver.get() +"-------------------------------------------");
    }

    @Test
    public void launchGoogle() throws InterruptedException {
        System.out.println( driver.get() +"----------launch Google-----------------------");

        driver.get().get("https://www.google.com");
        //driverFactory.getDriver().get("https://www.google.com");
        System.out.println("Google browser thread id is opened by  "+Thread.currentThread().getId());
        //System.out.println( driverFactory.getDriver() +"-------------------------------------------");

       // driver.get().close();
    }
    @Test
    public void launchBing() throws InterruptedException{
        System.out.println( driver.get() +"-------launch big------------------------------------");
        driver.get().get("https://www.bing.com");
        //driverFactory.getDriver().get("https://www.bing.com");
        System.out.println("Bing browser thread id is opened by "+Thread.currentThread().getId());
        Thread.sleep(1000);
    }


    @AfterMethod
    public void tearDown(){

        driver.get().quit();
    }
}
