package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By productHeader(){
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/div[1]/h3");
    }

    @Step
    public boolean headerAppears(){
        return $(productHeader()).isDisplayed();
    }

    @Step
    public boolean headerTextEqual(){
        return $(productHeader()).getText().equals("AltaShop");
    }

    private By iconSelectCategories(){
        return By.xpath("/html/body/div/div/main/div/div/div[1]/div/div[1]/div[1]/div[3]/div");
    }

    private By Categories(){
        return By.xpath("/html/body/div/div[3]/div/div[5]/div/div");
    }

    // add to cart
    private By productToCart(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[1]/div/div[1]");
    }

    private By iconBuy(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[2]/div/div[3]/div[2]/button[2]/span");
    }

    private By iconCart(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }

    @Step
    public void clickSelectCategories(){
        $(iconSelectCategories()).click();
    }

    @Step
    public void selectCategories(){
        $(Categories()).select();
    }

    @Step
    public void selectProductToCart(){
        $(productToCart()).select();
    }

    @Step
    public void clickIconBuy(){
        $(iconBuy()).click();
    }

    @Step
    public void clickIconCart(){
        $(iconCart()).click();
    }

    // give rating's product
    private By iconProductGiveRating(){
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[4]/div/div[1]");
    }

    private By iconDetail(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div[2]/div/div[8]/div/div[3]/div[2]/button[1]/span");
    }

    private By iconStar(){
        return By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/button[5]");
    }

    @Step
    public void selectProductGiveRating(){
        $(iconProductGiveRating()).select();
    }

    @Step
    public void clickIconDetail(){
        $(iconDetail()).click();
    }

    @Step
    public void clickIconStar(){
        $(iconStar()).click();
    }
}
