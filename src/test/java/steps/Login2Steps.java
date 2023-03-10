package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.ConfigsReader;

public class Login2Steps extends BaseClass {
    @When("admin user logs in with valid credentials")
    public void admin_user_logs_in_with_valid_credentials() {
        loginPage.loginToWebsiteviaConfigs("username", "password");

        //2nd way
//        sendText(loginPage.username, ConfigsReader.getProperties("username"));
//        sendText(loginPage.password,ConfigsReader.getProperties("password"));
//        click(loginPage.loginBtn);

        //3rd way
//        loginPage.username.sendKeys("Admin");
//        loginPage.password.sendKeys(ConfigsReader.getProperties("password"));
//        loginPage.loginBtn.click();
    }

    @Then("admin user logs in successfully")
    public void admin_user_logs_in_successfully() {
        String expectedMessage = "Welcome Admin";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Admin user unable to sign in", expectedMessage, actualMessage);

    }

    @When("ess user logs in with valid credentials")
    public void ess_user_logs_in_with_valid_credentials() {
        loginPage.loginToWebsiteviaConfigs("essUsername", "essPassword");
    }

    @Then("ess user logs in successfully")
    public void ess_user_logs_in_successfully() {
        String expectedMessage = "Welcome John";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Ess user unable to sign in", expectedMessage, actualMessage);
    }

    @When("user enters a valid {string} and a valid {string}")
    public void user_enters_a_valid_and_a_valid(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("user logs in successfully and the {string} is displayed")
    public void userLogsInSuccessfullyAndTheIsDisplayed(String expectedMessage) {
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("User log in is NOT successful",expectedMessage,actualMessage);
    }
}

