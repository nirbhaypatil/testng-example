package inheritance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildTests extends ParentTest{

    @Test
    public void superTest(){
        System.out.println("Inside sub super test ");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);

    }
    @Test
    public void FirstTest(){
        System.out.println("Inside First test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);

    }
    @Test(dependsOnMethods = "_lastTest")
    public void firstTest(){
        System.out.println("Inside first test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);
    }
    @Test
    public void _lastTest(){
        Assert.fail();
        System.out.println("Inside _last test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);
    }
    @Test
    public void $lastTest(){
        System.out.println("Inside $last test");
        String s1= "Selenium";
        String s2= "Selenium";
        Assert.assertEquals(s1, s2);

    }
}
