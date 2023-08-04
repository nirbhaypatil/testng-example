package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameters {

    @Test
    @Parameters({"browser","version"})
    public void testMethod(@Optional String browser , @Optional String version){
        System.out.println("Passed "+browser+" and version is "+version);

    }

    /**
     *
     * Checks default value overrides null value
     *
     * @param browser
     * @param version
     */
    @Test
    @Parameters({ "browser","version"})
    public void optionalParamterMethod(@Optional("b") String browser, @Optional("v") String version){
        System.out.println("Passed "+browser+" and version is "+version);

    }
}
