package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    public WebDriver driver;
    public Actions actions;

    public By doubleClick = By.id("doubleClickBtn");
    public By rightClick = By.id("rightClickBtn");
    public By clickMe = By.xpath( "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]");
    public By doubleClickMessage = By.id("doubleClickMessage");
    public By rightClickMessage = By.id("rightClickMessage");
    public By clickMeMessage = By.id("dynamicClickMessage");



    public Buttons(WebDriver driver,Actions actions) {
        this.driver = driver;
        this.actions = actions;
    }

    public WebElement getDoubleClick() {
        return driver.findElement(doubleClick);
    }

    public WebElement getRightClick() {
        return driver.findElement(rightClick);
    }

    public WebElement getClickMe() {
        return driver.findElement(clickMe);
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(doubleClickMessage);
    }

    public WebElement getRightClickMessage() {
        return driver.findElement(rightClickMessage);
    }

    public WebElement getClickMeMessage() {
        return driver.findElement(clickMeMessage);
    }


    public void doubleClickMethod() {
        WebElement doubleC= driver.findElement(doubleClick);
        actions.doubleClick(doubleC).build().perform();
    }

    public void rightClickMethod() {
        WebElement rightC = driver.findElement(rightClick);
        actions.contextClick(rightC).build().perform();
    }

}
