package inheritance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class superTest {

    @Test
    public void superTest(){
        System.out.println("Inside super test");
        String s1= "Selenium";
        String s2= "Not Selenium";
        Assert.assertEquals(s1, s2);

    }
}
