package groups;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups={"smoke"})
    public void openBrowser(){
        System.out.println("smoke: openbrowser test");
    }

    @Test(groups={"smoke"})
    public void login(){
        System.out.println("smoke: login test");
    }

    @Test(groups={"smoke"})
    public void logout(){
        System.out.println("smoke: logout test");
    }

    @Test(groups={"regression"})
    public void openApplication(){
        System.out.println("regression: open application test");
    }

    @Test(groups={"regression"})
    public void closeApplication(){
        System.out.println("regression: close application test");
    }
}
