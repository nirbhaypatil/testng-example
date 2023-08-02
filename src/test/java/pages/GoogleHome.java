package pages;

import org.openqa.selenium.WebDriver;

public class GoogleHome {

    WebDriver webDriver;

    public GoogleHome(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void launchApplication(){
        System.out.println( "----------launch Google-----------------------");

        webDriver.get("https://www.google.com");
    }

}
