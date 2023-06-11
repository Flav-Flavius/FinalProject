package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;


public class LoginPageTestCases extends BasePage {
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void completeWithValidCredentialsThenClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        loginPage.selectUsernameTextField("olteaninardeal@gmail.com");
        loginPage.selectPasswordTextField("Acreditare@11");
        loginPage.clickOnLoginButton();
    }
    @Test
    public void completeWithInvalidEmailThenClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        loginPage.selectUsernameTextField("jgkjgk@gmail.com");
        loginPage.selectPasswordTextField("Acreditare@11");
        loginPage.clickOnLoginButton();
        Assert.assertFalse(driver.getPageSource().contains("Please enter a correct username and password. Note that the password is case-sensitive"));
    }
   /* @Test
    public void completeInvalidPasswordThenClickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
        loginPage.selectUsernameTextField("olteaninardeal@gmail.com");
        loginPage.selectPasswordTextField("Acreditar@11" );
        loginPage.clickOnLoginButton();
        Assert.assertFalse(driver.getPageSource().contains("Please enter a correct username and password. Note that the password is case-sensitive. After 4 unsuccessful attempts your account will be locked."));
    }*/
}