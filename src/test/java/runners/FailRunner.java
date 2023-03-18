package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt"
        , glue = "steps"
        , plugin = {
        "pretty",
        "rerun:target/failed.txt"
}
)

//pom.xml is part of Page Object Model (POM)
public class FailRunner {


}
