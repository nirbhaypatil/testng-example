package testPriority;

import org.testng.annotations.Test;

public class TestPriority {

    @Test(priority=-1)
    public void negativePriorityMethod(){
        System.out.println("negative Priority Method");
    }
    @Test(priority=2)
    public void positivePriorityMethod(){
        System.out.println("positive Priority Method");
    }
    @Test(priority=0)
    public void ZeroPriorityMethod(){
        System.out.println("zero Priority Method");
    }
    @Test
    public void noPriorityMethod(){
        System.out.println("no Priority Method");
    }



}
