package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class User_Group_Categories_9_Steps {

    Library_BasePage library_basePage = new Library_BasePage();

    // @Given("User is on the liberian homepage")
    //public void user_is_on_the_liberian_homepage() {}

    @When("User click users module")
    public void user_click_users_module() {
        library_basePage.Users.click();
    }

    @When("the user click User Group dropdown")
    public void the_user_click_user_group_dropdown() {
        library_basePage.UserGroup.click();
    }


    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> options) throws StaleElementReferenceException {


        Select dropDown = new Select(library_basePage.UserGroup);
        List<String> actualTexts = BrowserUtils.getElementsText(dropDown.getOptions());

        System.out.println(library_basePage.UserGroup.getText());

        Assert.assertTrue(options.equals(actualTexts));


    }
}