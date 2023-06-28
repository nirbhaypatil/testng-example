package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testMethodOverload {
    @Parameters({"value1"})
    @Test
    public void NormalMethod(String name)
    {
        System.out.println("Normal Method");
    }

    @Parameters({"value2","age"})
    @Test
    public void NormalMethod(String name,int age)
    {
        System.out.println("Overloaded Method");
    }
}
