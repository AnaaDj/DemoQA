package Base_Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.util.List;

public class HomePage {

    public WebDriver driver;

    By category = By.className("card-up");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }

    public List<WebElement> getAllCategories() {
        return driver.findElements(category);
    }
    
    public WebElement getElements(){
        scroll(category);
        return getAllCategories().get(0);
    }

    public WebElement getForms(){
        scroll(category);
        return getAllCategories().get(1);
    }

    public WebElement getAlertsFrameWindows(){
        scroll(category);
        return getAllCategories().get(2);
    }

    public WebElement getWidgets(){
        scroll(category);
        return getAllCategories().get(3);
    }

    public WebElement getInteractions(){
        scroll(category);
        return getAllCategories().get(4);
    }
    public WebElement getBookStoreApplication(){
        scroll(category);
        return getAllCategories().get(5);
    }

}

