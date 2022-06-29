package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public WebDriver driver;
    public WebDriverWait wdwait;

    public By enableAfter = By.id("enableAfter");
    public By colorChange = By.id("colorChange");
    public By visibleAfter = By.id("visibleAfter");


    public DynamicProperties(WebDriver driver,WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;

    }
    public WebElement getEnableAfter() {
        return driver.findElement(enableAfter);
    }

    public WebElement getColorChange() {
        return driver.findElement(colorChange);
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(visibleAfter);
    }

}
