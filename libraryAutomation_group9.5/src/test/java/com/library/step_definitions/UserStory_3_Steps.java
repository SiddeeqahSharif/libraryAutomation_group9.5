package com.library.step_definitions;

import com.library.pages.Library_BasePage;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory_3_Steps {

    Library_BasePage library_basePage = new Library_BasePage();


    @Then("Librarian should see the following Modules")
    public void librarian_should_see_the_following(List<String> expectedModules) {

        for ( WebElement eachModule : library_basePage.librarianModules ) {
            System.out.println("eachModule = "  + eachModule.getText());
        }
    }

    @Then("Student should see following Modules")
    public void student_should_see_following(List<String> expectedModules) {

        for ( WebElement eachModule : library_basePage.studentModules) {
            System.out.println("eachModule = "  + eachModule.getText());
        }
    }


}
