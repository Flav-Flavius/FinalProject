package testCases;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.SelectDropdownListPage;

public class SelectDropdownListTestCases extends BasePage{
    private SelectDropdownListPage selectDropdownListPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        selectDropdownListPage = new SelectDropdownListPage(driver);
    }


    @Test
     public void clickOnSelectDropdownList () throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        selectDropdownListPage.selectSelectOption("Monday");
        Assert.assertEquals("Day selected :- Monday" , "Day selected :- Monday");
    }


    @Test

    public void clickOnDropboxDay () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
       Select day = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
       day.selectByVisibleText("Monday");
        Assert.assertEquals("Day selected :- Monday" , "Day selected :- Monday");
    }

    @Test

    public void selectFromMultiSelectOption () throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[4]/a")).click();
        Select country = new Select(driver.findElement(By.id("multi-select")));
        country.selectByVisibleText("New Jersey");
        country.selectByIndex(4);
        selectDropdownListPage.selectFirstSelected();
        selectDropdownListPage.selectLastSelected();
    }

}
