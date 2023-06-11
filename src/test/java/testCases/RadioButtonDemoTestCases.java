
package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RadioButtonDemoPage;

public class RadioButtonDemoTestCases extends BasePage {
    private RadioButtonDemoPage radioButtonDemoPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonDemoPage = new RadioButtonDemoPage(driver);
    }

    @Test
    public void clickOnMale() throws InterruptedException {

        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        radioButtonDemoPage.clickOnMale();
        Assert.assertEquals("Success - Male is checked", "Success - Male is checked");

    }
}
