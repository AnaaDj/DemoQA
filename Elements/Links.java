package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {

    public WebDriver driver;

    public By home = By.id("simpleLink");
    public By dynamicLink = By.id("dynamicLink");
    public By created = By.id("created");
    public By noContent = By.id("no-content");
    public By moved = By.id("moved");
    public By badRequest = By.id("bad-request");
    public By unauthorized = By.id("unauthorized");
    public By forbidden = By.id("forbidden");
    public By notFound = By.id("invalid-url");

    public By linkResponse = By.id("linkResponse");


    public Links(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeLink() {
        return driver.findElement(home);
    }

    public WebElement getDynamicLink() {
        return driver.findElement(dynamicLink);
    }

    public WebElement getCreated() {
        return driver.findElement(created);
    }

    public WebElement getNoContent() {
        return driver.findElement(noContent);
    }

    public WebElement getMoved() {
        return driver.findElement(moved);
    }

    public WebElement getBadRequest() {
        return driver.findElement(badRequest);
    }

    public WebElement getUnauthorized() {
        return driver.findElement(unauthorized);
    }

    public WebElement getForbidden() {
        return driver.findElement(forbidden);
    }

    public WebElement getNotFound() {
        return driver.findElement(notFound);
    }

    public String getResponse () {
        WebElement response = driver.findElement(linkResponse);
        return response.getText();
    }




}
