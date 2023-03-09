package steps;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before                  //Before annotation is from Cucumber not Junit.
    public void startBrowser(){
        BaseClass.setUp();
    }

    @After
    public void quitBrowser(){
        BaseClass.tearDown();
    }
}
