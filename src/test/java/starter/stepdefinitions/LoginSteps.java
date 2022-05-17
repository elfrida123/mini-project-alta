package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onLoginPage(){
        loginPage.openUrl();
        loginPage.clickLoginIcon();
        loginPage.validateLoginPage();
    }

    @When("I input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("elfrida@gmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("Akucantik88@");
    }

    @And("click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onHomePage(){
        homePage.headerAppears();
        homePage.headerTextEqual();
    }

    @When("I input {string} email")
    public void iInputValidEmail(String email) {
        loginPage.inputEmail(email);
    }

    @Then("I'm get message error")
    public void getMessageError(){
        loginPage.GetMessageError();
    }

    @And("I input {string} password")
    public void iInputPassword(String password) {
        loginPage.inputPassword(password);
    }
}
