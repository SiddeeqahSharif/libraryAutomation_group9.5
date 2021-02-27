package com.library.step_definitions;

import com.github.javafaker.Faker;
import com.library.pages.LibraryLoginPage;
import com.library.pages.LibraryUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;


public class AddUsers_stepDefinitions {
    Faker faker = new Faker(Locale.US);
    LibraryUsersPage libraryUsersPage = new LibraryUsersPage();
    LibraryLoginPage libraryLoginPage = new LibraryLoginPage();



    @Given("User clicks the add user button")
    public void user_clicks_the_add_user_button() {
        libraryUsersPage.Users.click();
        libraryUsersPage.AddUser.click();

    }

    @And("User enters correct Full Name")
    public void user_enters_correct_full_name() {
        libraryUsersPage.NewUserFullName.sendKeys(faker.name().fullName());
    }

    @And("User enters correct New User Password and Email")
    public void user_enters_correct_new_user_password_and_email() {
        libraryUsersPage.NewUserEmail.sendKeys(faker.name().firstName() + "^^^@gmail");
        libraryUsersPage.NewUserPassword.sendKeys(faker.name().firstName());
    }

    @And("User enters correct New User Address")
    public void user_enters_correct_new_user_address() {
        libraryUsersPage.NewUserAddress.sendKeys(faker.address().streetAddress());

    }

    @And("User clicks the SaveChangesButton")
    public void user_clicks_the_save_changes_button() {
        libraryUsersPage.SaveChangesButton.click();

    }

    @Then("User should see the new user on the UserPage")
    public void user_should_see_the_new_user_on_the_user_page() {
        libraryUsersPage.UserAddSuccessMessage.isDisplayed();
    }
}
