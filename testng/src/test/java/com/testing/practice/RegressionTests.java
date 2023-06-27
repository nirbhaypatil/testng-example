
package com.testing.practice;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RegressionTests {

    @BeforeTest
    public void testSetUp(){
        System.out.println("=================================================");
        System.out.println("before Test annotation");
    }

    @BeforeMethod
    public void testMethod(){
        System.out.println("=================================================");
        System.out.println("before method annotation");
    }
    @Test
    public void test1(){
        String s1= "Selenium";
        String s2= "Selenium Webdriver";
        Assert.assertEquals(s1, s2);

    }


    @AfterTest
    public void testTearDown(){
        System.out.println("=================================================");
        System.out.println("after test annotation");
    }
}