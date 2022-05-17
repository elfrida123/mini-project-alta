package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By titleRegister(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[1]");
    }

    private By namaLengkapField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input");
    }

    private By emailField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input");
    }

    private By passwordField(){
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/div/div[1]/div/input");
    }

    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button/span");
    }

    private By LoginIcon(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }

    private By linkRegister(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/a");
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
    public void clickLinkRegister(){
        $(linkRegister()).click();
    }

    @Step
    public boolean validateRegisterPage(){
        return $(titleRegister()).isDisplayed();
    }

    @Step
    public void fillNamaLengkap(String namalengkap){
        $(namaLengkapField()).type(namalengkap);
    }

    @Step
    public void fillEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void fillPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }
}
