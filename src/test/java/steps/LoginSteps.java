package steps;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.ConfigsReader;

public class LoginSteps extends BaseClass {
    @Then("welcome message is displayed in dashboard page")
    public void welcome_message_is_displayed_in_dashboard_page() {
//        if(dashboardPage.welcome.isDisplayed()){
//            System.out.println("Admin login is successful");
//        }
        String expectedWelcomeMessage="Welcome Admin";
        String actualWelcomeMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Admin login is NOT successfull.",expectedWelcomeMessage,actualWelcomeMessage);
        tearDown();
    }

    @When("user pass the valid username and invalid password")
    public void user_pass_the_valid_username_and_invalid_password() {
        loginPage.loginToWebsite(ConfigsReader.getProperties("username"),"invalidpassword");
    }

    @When("user pass the valid username and empty password")
    public void user_pass_the_valid_username_and_empty_password() {
        loginPage.loginToWebsite(ConfigsReader.getProperties("username"),"");
    }

    @Then("login error message for invalid password is displayed in loginpage")
    public void login_error_message_is_displayed_in_loginpage() {
//        if(loginPage.LoginErrorMessage.isDisplayed()){
//            System.out.println("User login is NOT successfull");
//        }
//        String expectedLoginErrorMessage="Invalid credentials";
//        String actualLoginErrorMessage=loginPage.LoginErrorMessage.getText();
//        Assert.assertEquals("Login Error Message is Incorrect",expectedLoginErrorMessage,actualLoginErrorMessage);

        Assert.assertEquals("Login Error Message is Incorrect","Invalid credentials",loginPage.LoginErrorMessage.getText());
        tearDown();
    }

    @Then("login error message for empty password is displayed in loginpage")
    public void loginErrorMessageForEmptyPasswordIsDisplayedInLoginpage() {
        String expectedLoginErrorMessage="Password cannot be empty";
        String actualLoginErrorMessage=loginPage.LoginErrorMessage.getText();
        Assert.assertEquals("Login Error Message is Incorrect",expectedLoginErrorMessage,actualLoginErrorMessage);
        tearDown();
    }
}
