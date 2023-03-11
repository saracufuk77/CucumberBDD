package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigsReader;


public class AddEmployeePage extends BaseClass {
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public  WebElement lastName;

    @FindBy(id = "employeeId")
    public WebElement employeeId;

    @FindBy(id ="photofile" )
    public WebElement uploadPhoto;

    @FindBy(id="chkLogin")
    public WebElement createLoginDetailsCheckBox;

    @FindBy(id="user_name")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(id="re_password")
    public WebElement confirmPassword;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

    public void addEmployee(String empFirstName, String empLastName, String filePath){
        sendText(firstName, ConfigsReader.getProperties(empFirstName));
        sendText(lastName,ConfigsReader.getProperties(empLastName));
        sendText(uploadPhoto,ConfigsReader.getProperties(filePath));  //retrieving photo location
        click(saveButton);
    }

    public void addEmployeeManuel(String empFirstName, String empLastName){
        sendText(firstName, empFirstName);
        sendText(lastName,empLastName);
        click(saveButton);
    }

    public void addemployeeWithLoginCredentials(String emplFirstName, String emplLastName){
        String emplPassword=randomStrongPassWord();
        String emplUserName = emplFirstName+emplLastName.toUpperCase();
        sendText(firstName,emplFirstName);
        sendText(lastName,emplLastName);
        click(createLoginDetailsCheckBox);
        sendText(username,emplUserName);
        sendText(password,emplPassword);
        sendText(confirmPassword,emplPassword);
        click(saveButton);
    }
}
