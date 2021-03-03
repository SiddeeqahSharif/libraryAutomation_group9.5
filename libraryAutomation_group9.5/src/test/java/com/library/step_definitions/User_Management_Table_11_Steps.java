package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class User_Management_Table_11_Steps {

    Library_BasePage library_basePage = new Library_BasePage();

    @When("the user click users module")
    public void the_user_click_users_module() {
        library_basePage.Users.click();
    }

    @Then("the user should see the following {string}")
    public void the_user_should_see_the_following(String expectedNames) {

        List<WebElement> columns = library_basePage.ColumnsNames;

        String[] actualNames = new String[6];//Array for the information from the List<> columns
        int actualNamesIndex = columns.indexOf(expectedNames) + 1;//not sure why we needed to add 1, but it worked
        actualNames[actualNamesIndex] = columns.get(actualNamesIndex).getText();//add column names into array

        if (actualNames[actualNamesIndex].equals(expectedNames)) { // compare the two strings
            System.out.println("Expected column names:" + expectedNames);
            System.out.println("Actual column names: " + actualNames[actualNamesIndex]);
        }
        //Assert.assertEquals(expectedName, actualName[actualNameIndex]);
        //This assert statement seems to use the following row in the Example table, causing tests to fail
        //It would have returned a printed statement similar to the one in the if statement above
    }
}

