package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBox {

    public WebDriver driver;

    By homeCB = By.className("rct-checkbox");
    By homeSvg = By.cssSelector(".rct-icon-expand-close");
    By documents = By.cssSelector(".rct-node:nth-child(2) .rct-collapse > .rct-icon");
    By office = By.cssSelector(".rct-node-collapsed:nth-child(2) .rct-checkbox > .rct-icon");
    By plus = By.cssSelector(".rct-icon-expand-all");
    By minus = By.cssSelector(".rct-icon-collapse-all > path");
    By result = By.id("result");

    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeSvg() {
        return driver.findElement(homeSvg);
    }
    public WebElement getPlus() {
        return driver.findElement(plus);
    }

    public WebElement getMinus() {
        return driver.findElement(minus);
    }
    public WebElement getArrowDown() {
        List<WebElement> svgList = driver.findElements(By.tagName("svg"));
        return svgList.get(47);
    }
    public WebElement getDocuments() {
        return driver.findElement(documents);
    }
    public WebElement getOffice() {
        return driver.findElement(office);
    }
    public WebElement getResult() {
        return driver.findElement(result);
    }

    public WebElement getHomeCB() {return driver.findElement(homeCB);}


}
