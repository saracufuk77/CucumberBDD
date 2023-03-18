package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BaseClass {
 @FindBy(id = "welcome")   //<== driver find element (By.id("welcome"))
 public WebElement welcome;   //public Webelement welcome =driver.findelement(By.id("welcome"))
 @FindBy(xpath = "//*[@alt='Exelenter Project']")
 public WebElement dashboardLogo;

 @FindBy(css = "#mainMenu b")
// public WebElement mainMenu;     not this one. it is a list
   public List<WebElement> mainMenu;


    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

}
