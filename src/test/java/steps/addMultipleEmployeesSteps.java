package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AddEmployeePage;

public class addMultipleEmployeesSteps extends BaseClass {
    @Given("user navigates to the add employee page")
    public void user_navigates_to_the_add_employee_page() {
        pimPage.navigateToAddEmployee();
    }

    @When("user enters employee's {string} {string} and {string}")
    public void user_enters_employee_s_and(String firstName, String middleName, String lastName) {
        sendText(addEmployeePage.firstName, firstName);
        sendText(addEmployeePage.middleName, middleName);
        sendText(addEmployeePage.lastName, lastName);
    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        addEmployeePage.saveButton.click();
    }

    @Then("new employee {string} is added successfully.")
    public void new_employee_is_added_successfully(String fullName) {
        Assert.assertEquals("Actual and expected names does NOT mathch",fullName,personalDetailsPage.employeeFullName.getText());
    }

}
