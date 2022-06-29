package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Elements {

    public WebDriver driver;

    By textBox = By.id("item-0");
    By checkBox = By.id("item-1");
    By radioButton = By.id("item-2");
    By webTables = By.id("item-3");
    By buttons = By.id("item-4");
    By links = By.id("item-5");
    By brokenLinksImages = By.id("item-6");
    By uploadAndDownload = By.id("item-7");
    By dynamicProperties = By.id("item-8");


    public Elements (WebDriver driver) {
        this.driver = driver;
    }

    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }


    public WebElement getTextBox() {
        scroll(textBox);
      return driver.findElement(textBox);
    }

    public WebElement getCheckBox() {
        scroll(checkBox);
        return driver.findElement(checkBox);
    }

    public WebElement getRadioButton() {
        scroll(radioButton);
        return driver.findElement(radioButton);
    }

    public WebElement getWebTables() {
        scroll(webTables);
        return driver.findElement(webTables);
    }

    public WebElement getButtons() {
        scroll(buttons);
        return driver.findElement(buttons);
    }

    public WebElement getLinks() {
        scroll(links);
        return driver.findElement(links);
    }

    public WebElement getBrokenLinksImages() {
        scroll(brokenLinksImages);
        return driver.findElement(brokenLinksImages);
    }

    public WebElement getUploadAndDownload() {
        scroll(uploadAndDownload);
        return driver.findElement(uploadAndDownload);
    }

    public WebElement getDynamicProperties() {
        scroll(dynamicProperties);
        return driver.findElement(dynamicProperties);
    }
}
