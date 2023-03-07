package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  //Specify path from Content Root, feature option will establish connection with feature file/s
        glue = "steps"         //specify path from Source Root, glue will establis connection with step definitions

)


public class TestRunner {
    //path for feature files
    //path for steps definitions
    //@smoke, @regression
    //you can run only one test or multiple

}
