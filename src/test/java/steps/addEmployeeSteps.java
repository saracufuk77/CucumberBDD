package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

public class addEmployeeSteps extends BaseClass {
    String newUserFirstname="New1";
    String newUserLastname="User1";
    @Given("user navigates to the add employee list page")
    public void user_navigates_to_the_add_employee_list_page() {
        pimPage.navigateToAddEmployee();
    }
    @When("user add a new employee by entering firstname and lastname")
    public void userAddANewEmployeeByEnteringFirstnameAndLastname() {
        addEmployeePage.addEmployeeManuel(newUserFirstname,newUserLastname);
    }
    @Then("new employee information is displayed in the personal details page")
    public void new_employee_information_is_displayed_in_the_personal_details_page() {
        if(personalDetailsPage.personalDetailsHeader.isDisplayed()){
            System.out.println("New user "+ newUserFirstname+" "+newUserLastname+" is added successfully");
        }
        tearDown();
    }

    @Given("user delete the employee id field")
    public void user_delete_the_employee_id_field() {
        wait(1);
        addEmployeePage.employeeId.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        wait(1);
    }

    @When("user add a new employee with login credentials")
    public void userAddANewEmployeeWithLoginCredentials() {
        addEmployeePage.addemployeeWithLoginCredentials(newUserFirstname,newUserLastname);
    }
}
