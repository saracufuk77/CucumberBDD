package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"  //Specify path from Content Root, feature option will establish connection with feature file/s
        ,glue = "steps"         //specify path from Source Root, glue will establis connection with step definitions
        ,dryRun = true     // If set to true, it will check if ALL step definitions have implementation. Without running your actual scenarios (headless)
        ,monochrome = true  //this will print test results in the console in more human readable
//        ,tags = "@regression"   //run test(s) with provided tag name
//        ,tags = "@smoke"
//        ,tags="@regression and @smoke" //testlerin uzerindeki annotationlari check edecek. regression ve smoke ise calisitracak. ikisi birden degilse calistirmayacak.
//        ,tags="@regression or @smoke"    //testlerin uzerindeki annotationlari check edecek. regression ya da smoke ise calisitracak
          ,tags = "@login2"
)

public class TestRunner {
    //path for feature files
    //path for steps definitions
    //@smoke, @regression
    //you can run only one test or multiple

}
