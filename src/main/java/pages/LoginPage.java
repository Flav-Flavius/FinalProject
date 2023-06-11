package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }



    By EmailTextField = By.xpath("//*[@id=\"email\"]");
    By PasswordTextField = By.id("password");

    By LoginButton = By.xpath("//*[@id=\"login-button\"]");


    public void selectUsernameTextField (String arg1) {
        driver.findElement(EmailTextField).sendKeys(arg1);
    }

    public void selectPasswordTextField (String arg2) {

        driver.findElement(PasswordTextField).sendKeys(arg2);
    }

    public void clickOnLoginButton() {
        driver.findElement(LoginButton).click();
    }
}

