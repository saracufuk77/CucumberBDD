package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BaseClass.*;

public class EmployeeListPage {
    @FindBy(id="empsearch_id")
    public WebElement employeeIdSearchField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement employeeNameSearchField;

    @FindBy(id="searchBtn")
    public WebElement empListSearchBtn;

    public void searchEmployeebyId(String empId){
        employeeIdSearchField.sendKeys(empId);
    }

    public void searchEmployeebyName(String empName){
        employeeNameSearchField.sendKeys(empName);
    }
    public EmployeeListPage(){
        PageFactory.initElements(driver,this);
    }

}
