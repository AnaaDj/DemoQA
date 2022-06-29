package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {

    public WebDriver driver;
    public By fullName = By.id("userName");
    public By email = By.id("userEmail");
    public By currentAddress = By.id("currentAddress");
    public By permanentAddress = By.id("permanentAddress");
    public By submit = By.id("submit");
    public By response = By.id("output");


    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }


    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFullName() {
        return driver.findElement(fullName);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(permanentAddress);
    }

    public WebElement getSubmit() {
        return driver.findElement(submit);
    }

    public WebElement getResponse() {return driver.findElement(response);}




    public void textBoxCredentials(String name,String email,String currentA,String permanentA) {
        getFullName().sendKeys(name);
        getEmail().sendKeys(email);
        getCurrentAddress().sendKeys(currentA);
        getPermanentAddress().sendKeys(permanentA);
        scroll(submit);
        getSubmit().click();
    }




}
