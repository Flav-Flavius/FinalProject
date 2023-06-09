
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownListPage extends BasePage {
    public SelectDropdownListPage(WebDriver driver) {
        super(driver);
    }

    By SelectOption = By.id("select-demo");

    public void selectSelectOption(String arg1) {
        driver.findElement(SelectOption).sendKeys(arg1);
    }


   By DropboxDay = By.xpath("//*[@id=\"select-demo\"]");

    public void selectDropboxDay () {
        driver.findElement(DropboxDay).click();
    }


    By FirstSelected = By.id("printMe");
    public void selectFirstSelected () {
        driver.findElement(FirstSelected).click();
    }
    By LastSelected = By.id("printAll");
    public void selectLastSelected () {
        driver.findElement(LastSelected).click();
    }
}