package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class User_Status_10_Steps {

    Library_BasePage library_basePage = new Library_BasePage();

    @When("User clicks the status dropdown")
    public void user_clicks_the_status_dropdown() {
        library_basePage.Status.click();
    }

    @And("User sees status options")
    public void userSeesStatusOptions(List<String> option) {
        Select dropDown = new Select(library_basePage.Status);
        List<String> status = BrowserUtils.getElementsText(dropDown.getOptions());
        Assert.assertEquals("All status options are visible.", status, option);
    }


}
