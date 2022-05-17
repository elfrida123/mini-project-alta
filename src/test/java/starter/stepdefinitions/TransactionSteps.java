package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.TransactionPage;

public class TransactionSteps {
    @Steps
    CartPage cartPage;

    @Steps
    TransactionPage transactionPage;

    @Steps
    CartSteps cartSteps;

    // pay-item
    @When("I select the product which want to pay")
    public void selectProductPay(){
        cartSteps.selectProduct();
    }

    @And("I click button Bayar")
    public void clickButtonBayar(){
        cartPage.clickIconBayar();
    }

    @Then("I am on the transaction page")
    public void onTransactionPage(){
        transactionPage.validateOnTransactionPage();
    }

    // view-transactions-rows-5
    @Given("I am on the transaction page for view all transaction page 5")
    public void onTheTransactionPage5(){
        cartSteps.selectProduct();
        cartPage.clickIconBayar();
        transactionPage.validateOnTransactionPage();
    }

    @When("I click icon dropdown in rows per page")
    public void clickIconDropdown5(){
        transactionPage.clickIconDropdown5();
    }

    @Then("I select 5")
    public void select5(){
        transactionPage.clickRows5();
    }

    // view-transactions-rows-10
    @Given("I am on the transaction page for view all transaction page 10")
    public void onTheTransactionPage10(){
        onTheTransactionPage5();
    }

    @Then("I select 10")
    public void select10(){
        transactionPage.clickRows10();
    }

    // view-transactions-rows-15
    @Given("I am on the transaction page for view all transaction page 15")
    public void onTheTransactionPage15(){
        onTheTransactionPage5();
    }

    @Then("I select 15")
    public void select15(){
        transactionPage.clikRows15();
    }

    // valid-view-by-filtering-produk-ascending
    @Given("I am on the transaction page for filtering by Produk ascending")
    public void onTheTransactionPageFilteringByProdukAsc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown in field Produk")
    public void clickDropdownInFieldProdukAsc(){
        transactionPage.clickDropdownFilteringProdukAsc();
    }

    // valid-view-by-filtering-produk-descending
    @Given("I am on the transaction page for filtering by Produk descending")
    public void onTheTransactionPageFilteringByProdukDesc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown descending in field Produk")
    public void clickDropdownInFieldProdukDesc(){
        transactionPage.clickDropdownFilteringProdukDesc();
    }

    // valid-view-by-filtering-harga-ascending
    @Given("I am on the transaction page for filtering by Harga ascending")
    public void onTheTransactionPageFilteringByHargaAsc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown in field Harga")
    public void clickDropdownInFieldHargaAsc(){
        transactionPage.clickDropdownFilteringHargaAsc();
    }

    // valid-view-by-filtering-harga-descending
    @Given("I am on the transaction page for filtering by Harga descending")
    public void onTheTransactionPageFilteringByHargaDesc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown descending in field Harga")
    public void clickDropdownInFieldHargaDesc(){
        transactionPage.clickDropdownFilteringHargaDes();
    }

    // valid-view-by-filtering-banyaknya-descending
    @Given("I am on the transaction page for filtering by Banyaknya ascending")
    public void onTheTransactionPageFilteringByBanyaknyaAsc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown ascending in field Banyaknya")
    public void clickDropdownInFieldBanyaknyaAsc(){
        transactionPage.clickDropdownFilteringBanyaknyaAsc();
    }

    // valid-view-by-filtering-banyaknya-descending
    @Given("I am on the transaction page for filtering by Banyaknya descending")
    public void onTheTransactionPageFilteringByBanyaknyaDesc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown in field Banyaknya")
    public void clickDropdownInFieldBanyaknyaDesc(){
        transactionPage.clickDropdownFilteringBanyaknyaDesc();
    }

    // valid-view-by-filtering-subtotal-asscending
    @Given("I am on the transaction page for filtering by Sub-total ascending")
    public void onTheTransactionPageFilteringBySubtotalAsc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown ascending in field Sub-total")
    public void clickDropdownInFieldSubtotalAsc(){
        transactionPage.clickDropdownFilteringSubtotalAsc();
    }

    // valid-view-by-filtering-subtotal-descending
    @Given("I am on the transaction page for filtering by Sub-total descending")
    public void onTheTransactionPageFilteringBySubtotalDesc(){
        onTheTransactionPage5();
    }

    @When("I click icon dropdown in field Sub-total")
    public void clickDropdownInFieldSubtotalDesc(){
        transactionPage.clickDropdownFilteringSubtotalDesc();
    }

}
