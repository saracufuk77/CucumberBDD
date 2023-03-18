package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * As of Cucumber 7.0 and later asList(), asLists(), and asMaps() have changed:
 * Replace DataTable.asList() with -> DataTable.values()
 * Replace DataTable.asLists() with -> DataTable.cells()
 * Replace DataTable.asMaps() with -> DataTable.entries()
 */
public class DashboardSteps extends BaseClass {
    @Then("user should see dashboard menu displayed")
    public void user_should_see_dashboard_menu_displayed(DataTable menu) {
//        menu.asList(); bunun yerine alttakini kullan. it is depreciated
        List<String> expectedAdminMenu = menu.values();
        List<String > actualAdminMenu = new ArrayList<>();
        for (int i = 0; i < dashboardPage.mainMenu.size(); i++) {
            actualAdminMenu.add(dashboardPage.mainMenu.get(i).getText());
        }

//        //2.nd way
//        for (String mainMenu : actualAdminMenu) {
//            actualAdminMenu.add(mainMenu.getText());
//        }

        //Assertion
        Assert.assertEquals("Menus do not match",expectedAdminMenu,actualAdminMenu);
        System.out.println("expectedAdminMenu = " + expectedAdminMenu);
        System.out.println("actualAdminMenu   = " + actualAdminMenu);

    }
}
