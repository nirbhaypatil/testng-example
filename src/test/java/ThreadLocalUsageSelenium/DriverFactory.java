package ThreadLocalUsageSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private WebDriver driver;
    private static ThreadLocal <WebDriver> threadLocal  = new ThreadLocal<>();


    public WebDriver getWebDriver(){
        return driver;
    }
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        threadLocal.set( new ChromeDriver());
    }

    public static WebDriver getDriver(){
        return threadLocal.get();
    }

}