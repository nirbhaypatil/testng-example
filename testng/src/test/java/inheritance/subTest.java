package inheritance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class subTest extends  superTest {

    @Test
    public void subTest(){
        System.out.println("Inside sub test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);

    }
}
