package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.HomePage;

public class CartSteps {
    @Steps
    HomePage homePage;

    @Steps
    HomeSteps homeSteps;

    @Steps
    CartPage cartPage;

    @When("I select the product which want to add quantity")
    public void selectProduct(){
        homeSteps.onTheHomePageForSelect();
        homePage.selectProductToCart();
        homePage.clickIconBuy();
        homePage.clickIconCart();
        cartPage.selectProduct();
    }

    @Then("I click icon add")
    public void clickIconAdd(){
        cartPage.clickIconAdd();
    }

    @When("I select the product which want to reduce quantity")
    public void selectProductReduce(){
        selectProduct();
    }

    @Then("I click icon minus")
    public void clickIconMinus(){
        cartPage.clickIconMinus();
    }

}
