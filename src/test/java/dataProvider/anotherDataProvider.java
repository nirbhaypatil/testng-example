package dataProvider;

import org.testng.annotations.DataProvider;

public class anotherDataProvider {

    @DataProvider(name = "StudentData")
    public String [][] StudentData(){

        return new String[][]{{"Student 1","30"},{"Student 2","40"}};
    }
}
