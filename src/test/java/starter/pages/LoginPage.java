package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By passwordField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    private By LoginIcon(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }

    private By messageError(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]");
    }

    @Step
    public void openUrl(){
        open();
    }

    @Step
    public void clickLoginIcon(){
        $(LoginIcon()).click();
    }

    @Step
    public boolean validateLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean GetMessageError(){
        return $(messageError()).isDisplayed();
    }
}
