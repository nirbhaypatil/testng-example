package inheritance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParentTest {

    @Test
    public void superTest(){
        System.out.println("Inside super test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);

    }

}
