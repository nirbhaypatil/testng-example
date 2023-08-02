package ThreadLocalUsageSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class TestCases {


    @BeforeMethod
    public void setUpBrowser(){
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setDriver();
        System.out.println("Inside before method");
     //   System.out.println( driver.get() +"-------------------------------------------");
    }

    @Test
    public void launchGoogle() throws InterruptedException {
        System.out.println( "----------launch Google-----------------------");

        DriverFactory.getDriver().get("https://www.google.com");
        System.out.println("Google browser thread id is opened by  "+Thread.currentThread().getId());

       // driver.get().close();
    }
    @Test
    public void launchBing() throws InterruptedException{

        System.out.println( "----------launch Bing-----------------------");
        DriverFactory.getDriver().get("https://www.bing.com");
        System.out.println("Bing browser thread id is opened by "+Thread.currentThread().getId());
        Thread.sleep(1000);
    }


    @AfterMethod
    public void tearDown(){
        DriverFactory.getDriver().close();
    }
}
