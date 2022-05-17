package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By iconAdd(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[2]/button[2]");
    }

    private By iconMinus(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[1]/div/div[1]/div[2]/button[1]/span");
    }

    private By productsCart(){
        return By.xpath("//*[@id=\"order-187\"]/div[1]/div[1]");
    }

    private By iconBayar(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/button/span");
    }

    @Step
    public void clickIconAdd(){
        $(iconAdd()).click();
    }

    @Step
    public void clickIconMinus(){
        $(iconMinus()).click();
    }

    @Step
    public void selectProduct(){
        $(productsCart()).select();
    }

    @Step
    public void clickIconBayar(){
        $(iconBayar()).click();
    }

}
