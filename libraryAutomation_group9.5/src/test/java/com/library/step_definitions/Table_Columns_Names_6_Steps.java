package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Table_Columns_Names_6_Steps {

    Library_BasePage basePage = new Library_BasePage();

    @Then("I should see following column names:")
    public void i_should_see_following_column_names(List<String> expectedColumnsNames) {
        //System.out.println("expectedColumnsNames = " + expectedColumnsNames);
        // System.out.println("expectedColumnsNames.size() = " + expectedColumnsNames.size());

        BrowserUtils.sleep(2);
        List<String> actualColumnsNames = BrowserUtils.getElementsText(basePage.tableHeaders);

        Assert.assertEquals(expectedColumnsNames, actualColumnsNames);
    }
}
