package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class HomeSteps {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    // select categories
    @Given("I am on the home page for select categories")
    public void onTheHomePageForSelect(){
        loginPage.openUrl();
        loginPage.clickLoginIcon();
        loginPage.validateLoginPage();
        loginPage.inputEmail("elfrida@gmail.com");
        loginPage.inputPassword("Akucantik88@");
        loginPage.clickLoginButton();
        homePage.headerAppears();
        homePage.headerTextEqual();
    }

    @When("I click select categories")
    public void clickSelectCategories(){
        homePage.clickSelectCategories();
    }

    @Then("I select the categories")
    public void selectCategories(){
        homePage.selectCategories();
    }

    // add product to cart
    @Given("I am on the home page for add product to cart")
    public void onTheHomePageForAdd(){
        onTheHomePageForSelect();
    }

    @When("I select the product which want add to the cart")
    public void selectProductToCart(){
        homePage.selectProductToCart();
    }

    @Then("I click icon buy")
    public void clickIconBuy(){
        homePage.clickIconBuy();
    }

    // give rating's product
    @Given("I am on the home page for give rating's product")
    public void onTheHomePageForGiveRating(){
        onTheHomePageForSelect();
    }

    @When("I select the product which want to give rating")
    public void selectProductGiveRatings(){
        homePage.selectProductGiveRating();
    }

    @And("I click button Detail")
    public void clickButtonDetail(){
        homePage.clickIconDetail();
    }

    @Then("I click icon star")
    public void clickIconStar(){
        homePage.clickIconStar();
    }

}
