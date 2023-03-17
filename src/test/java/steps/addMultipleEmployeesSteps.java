package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AddEmployeePage;

import java.util.List;
import java.util.Map;

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
    @When("user enters employee's fullname and clicks on save button")
    public void user_enters_employee_s_fullname_and_clicks_on_save_button(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps();
//        System.out.println(mapList);
        mapList.forEach(System.out::println);
        int mapSize = mapList.size();
        int counter=0;
        for (Map<String, String> user : mapList) {
//            System.out.println(user.get("FirstName"));
            sendText(addEmployeePage.firstName,user.get("FirstName"));
            addEmployeePage.middleName.sendKeys(user.get("MiddleName"));
            sendText(addEmployeePage.lastName,user.get("LastName"));
            addEmployeePage.saveButton.click();

            //Assertion//Validation
            String expectedFullName = user.get("FirstName")+" "+user.get("MiddleName")+" "+user.get("LastName");
            String actualFullName = personalDetailsPage.employeeFullName.getText();
            Assert.assertEquals("User does not match",expectedFullName,actualFullName);

            counter++;
            //Click Add Employee again
            wait(1);
            if(counter!=mapSize)
                pimPage.addEmployee.click();
        }

    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {

    }


}
