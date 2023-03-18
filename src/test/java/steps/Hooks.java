package steps;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks {
    @Before                  //Before annotation is from Cucumber not Junit.
    public void startBrowser(){
        BaseClass.setUp();
    }

    @After
    public void quitBrowser(Scenario scenario){
        if(scenario.isFailed()){
            CommonMethods.takeScreenshot("FailedTests/"+scenario.getName());
        }
        BaseClass.tearDown();
    }
}
