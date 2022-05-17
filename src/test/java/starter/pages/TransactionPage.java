package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {

    // pay-item
    private By onTransactionPage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/h1");
    }

    @Step
    public boolean validateOnTransactionPage(){
        return $(onTransactionPage()).isDisplayed();
    }

    // view-transactions-rows-5
    private By iconDropdown5(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/div/i");
    }

    private By rows5(){
        return By.xpath("/html/body/div/div[2]/div/div[1]");
    }

    private By rows10(){
        return By.xpath("/html/body/div/div[2]/div/div[2]");
    }

    private By rows15(){
        return By.xpath("/html/body/div/div[2]/div/div[3]/div/div");
    }

    @Step
    public void clickIconDropdown5(){
        $(iconDropdown5()).click();
    }

    @Step
    public void clickRows5(){
        $(rows5()).select();
    }

    @Step
    public void clickRows10(){
        $(rows10()).select();
    }

    @Step
    public void clikRows15(){
        $(rows15()).select();
    }

    // valid-view-by-filtering-produk-descending
    private By dropdownFilteringProdukAsc(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/table/thead/tr/th[1]/i");
    }

    @Step
    public void clickDropdownFilteringProdukAsc(){
        $(dropdownFilteringProdukAsc()).click();
    }

    // valid-view-by-filtering-produk-descending
    private By dropdownFilteringProdukDesc(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/table/thead/tr/th[1]/i");
    }

    @Step
    public void clickDropdownFilteringProdukDesc(){
        $(dropdownFilteringProdukDesc()).click();
        $(dropdownFilteringProdukDesc()).click();
    }

    // valid-view-by-filtering-harga-ascending
    private By dropdownFilteringHargaAsc(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[2]/i");
    }

    @Step
    public void clickDropdownFilteringHargaAsc(){
        $(dropdownFilteringHargaAsc()).click();
        $(dropdownFilteringHargaAsc()).click();
    }

    // valid-view-by-filtering-harga-descending
    private By dropdownFilteringHargaDesc(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[1]/table/thead/tr/th[2]/i");
    }

    @Step
    public void clickDropdownFilteringHargaDes(){
        $(dropdownFilteringHargaDesc()).click();
        $(dropdownFilteringHargaDesc()).click();
    }

    // valid-view-by-filtering-banyaknya-descending
    private By dropdownFilteringBanyaknyaDesc(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[3]/i");
    }

    @Step
    public void clickDropdownFilteringBanyaknyaDesc(){
        $(dropdownFilteringBanyaknyaDesc()).click();
        $(dropdownFilteringBanyaknyaDesc()).click();
    }

    // valid-view-by-filtering-banyaknya-ascending
    private By dropdownFilteringBanyaknyaAsc(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[3]/i");
    }

    @Step
    public void clickDropdownFilteringBanyaknyaAsc(){
        $(dropdownFilteringBanyaknyaAsc()).click();
    }

    // valid-view-by-filtering-subtotal-ascending
    private By dropdownFilteringSubtotalAsc(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]/i");
    }

    @Step
    public void clickDropdownFilteringSubtotalAsc(){
        $(dropdownFilteringSubtotalAsc()).click();
    }

    // valid-view-by-filtering-subtotal-descending
    private By dropdownFilteringSubtotalDes(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]/i");
    }

    @Step
    public void clickDropdownFilteringSubtotalDesc(){
        $(dropdownFilteringSubtotalDes()).click();
        $(dropdownFilteringSubtotalDes()).click();
    }
}
