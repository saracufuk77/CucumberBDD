package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage {
    @FindBy(id="empsearch_id")
    public WebElement employeeIdSearchField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement employeeNameSearchField;

    @FindBy(id="searchBtn")
    public WebElement empListSearchBtn;

}
