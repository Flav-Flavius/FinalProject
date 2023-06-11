
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonDemoPage extends BasePage{
    public RadioButtonDemoPage(WebDriver driver){super(driver);}

    By Male = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input");
    public void clickOnMale(){driver.findElement(Male).click();}

    By Female = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]/input");
    public void clickOnFemale(){driver.findElement(Female).click();}

    By Age0to5 = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div[1]/div[2]/label[1]/input");
    public void clickOnAge0to5(){driver.findElement(Age0to5).click();}

    By Age5to15 = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div[1]/div[2]/label[2]");
    public void clickOnAge5to15(){driver.findElement(Age5to15).click();}

    By Age15to50 = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div[1]/div[2]/label[3]");
    public void clickOnAge15to50(){driver.findElement(Age15to50).click();}
}
