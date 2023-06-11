package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;
import pages.SimpleFormPage;

public class CheckboxPageTestCases extends BasePage{
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException{
         driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }

    @Test
    public void clickOnTheFirstDisabledCheckboxCheckmark () throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheFirstDisabledCheckboxOption();
        Assert.assertEquals(true,true);
    }

    @Test
    public void clickOnTheThirdDisabledCheckboxCheckmark () throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheThirdDisabledCheckboxOption();

    }
    @Test
    public void clickOnTheSingleCheckboxCheckmark1() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        WebElement singleCheckbox = driver.findElement(By.id("isAgeSelected"));
        singleCheckbox.click();

        if (singleCheckbox.isSelected()) {
            System.out.println("Checkbox is toggled on");
        } else {
            System.out.println("Checkbox is toggled off");
        }
        singleCheckbox.click();

        if (singleCheckbox.isSelected()) {
            System.out.println("Checkbox is now toggled off");
        }
    }
    @Test
    public void clickOnAllCheckboxCheckmarks() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div/ul/li[2]/a")).click();
        checkboxPage.clickOnTheFirstCheckboxOption();
        checkboxPage.clickOnTheSecondCheckboxOption();
        checkboxPage.clickOnTheThirdCheckboxOption();
        checkboxPage.clickOnTheForthCheckboxOption();
        Assert.assertEquals(true, true);

    }

}