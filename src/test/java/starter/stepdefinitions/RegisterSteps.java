package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the registration page")
    public void onTheRegistrationPage(){
        registerPage.openUrl();
        registerPage.clickLoginIcon();
        registerPage.clickLinkRegister();
        registerPage.validateRegisterPage();
    }

    @When("I fill the field Nama Lengkap with valid format")
    public void fillNamaLengkap(){
        registerPage.fillNamaLengkap("Risda Tampubolon");
    }

    @And("I fill the field Email with valid format")
    public void fillEmail(){
        registerPage.fillEmail("elfridaelll@gmail.com");
    }

    @And("I fill the field Password with valid password")
    public void fillPassword(){
        registerPage.fillPassword("Akucantik");
    }

    @And("click the Register button")
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }

    @Then("I am on the login page after register")
    public void onTheLoginPage(){
        loginPage.validateLoginPage();
    }

    @Then("get error message")
    public void getMessageError(){
        loginPage.GetMessageError();
    }

    @When("I fill the field {string} Nama Lengkap")
    public void iFillTheFieldNamaLengkap(String NamaLengkap) {
        registerPage.fillNamaLengkap(NamaLengkap);
    }

    @And("I fill the field {string} Email")
    public void iFillTheFieldEmail(String Email) {
        registerPage.fillEmail(Email);
    }

    @And("I fill the field {string} Password")
    public void iFillTheFieldPassword(String Password) {
        registerPage.fillPassword(Password);
    }
}
