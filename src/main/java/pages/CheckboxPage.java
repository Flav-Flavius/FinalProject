package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage{
    public CheckboxPage(WebDriver driver){
        super(driver);
    }

    By SingleCheckbox = By.id("AgeIsSelected");
    public void clickOnSingleCheckbox(){ driver.findElement(SingleCheckbox).click();}

    By FirstCheckboxOption = By.id("ex1-check1");
    public void clickOnTheFirstCheckboxOption(){driver.findElement(FirstCheckboxOption).click();}
    By SecondCheckboxOption = By.id("ex1-check2");
    public void clickOnTheSecondCheckboxOption(){driver.findElement(SecondCheckboxOption).click();}

    By ThirdCheckboxOption = By.id("/html/body/div[1]/div/section[3]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[4]/input");
    public void clickOnTheThirdCheckboxOption(){driver.findElement(ThirdCheckboxOption).click();}

    By ForthCheckboxOption = By.xpath("ex1-check3");
    public void clickOnTheForthCheckboxOption(){driver.findElement(ForthCheckboxOption).click();}

    By CheckAllOption = By.id("box");
    public void clickOnTheCheckAllButton(){driver.findElement(CheckAllOption).click();}


    By FirstDisabledCheckboxOption = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");
    public void clickOnTheFirstDisabledCheckboxOption () {
        driver.findElement(FirstDisabledCheckboxOption).click();
    }

    By ThirdDisableCheckboxOption = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input");
    public void clickOnTheThirdDisabledCheckboxOption() {
        driver.findElement(ThirdDisableCheckboxOption).isEnabled();

    }
}

