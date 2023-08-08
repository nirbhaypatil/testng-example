package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @Test(dataProvider = "DataContainer")
    public void testMethod(String first,String second, String last  ){

               System.out.println(" First param:"+first +" Second param"+second+" Last param"+last);
        }

    @Test(dataProvider = "StudentData" ,dataProviderClass = anotherDataProvider.class)
    public void testMethod(String name,String age){

        System.out.println(" Student Name:"+ name +" &  Age "+age);
    }

    @DataProvider(name="DataContainer")
    public Object[][] Dataprovider(){
        Object[][] data = new Object[1][3];
        data[0][0] = "  This is";
        data[0][1] = "  Dataprovider Test";
        data[0][2] = "  example";
        return data;
    }
}
