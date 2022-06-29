package BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebDriver driver;
    public String url = "https://demoqa.com/login";


    By userName = By.id("userName");
    By password = By.id("password");
    By login = By.id("login");
    By logout = By.xpath("//*[@id=\"submit\"]");
    By newUser = By.id("newUser");
    By errorMessage = By.id("output");

    By viewProfile = By.linkText("profile");


    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserName() {
        return driver.findElement(userName);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getLogin() {
        return driver.findElement(login);
    }
    public WebElement getLogout() {
        return driver.findElement(logout);
    }
    public WebElement getNewUser() {
        return driver.findElement(newUser);
    }
    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }
    public WebElement getViewProfile() {
        return driver.findElement(viewProfile);
    }

    public void loginMethod(String username, String password) {
        driver.navigate().to(url);
        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
        getLogin().click();
    }

    public void validLogin() {
        driver.navigate().to(url);
        getUserName().sendKeys("AnaDj");
        getPassword().sendKeys("AnaDj5119%");
        getLogin().click();
    }







}
