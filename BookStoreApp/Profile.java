package BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile {

    public WebDriver driver;
    public String url = "https://demoqa.com/profile";


    By goToBookStoreButton = By.id("gotoStore");
    By searchBox=By.id("searchBox");
    By loggedInUsername =By.id("userName-value");
    By logout = By.linkText("Log out");
    By deleteAcc = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[2]/button[1]");
    By deleteAllBooks = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[3]/button[1]");
    By deleteAllBooksPopUp = By.id("closeSmallModal-ok");


    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }


    public Profile(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGoToBookstore() {
        return driver.findElement(goToBookStoreButton);
    }
    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }
    public WebElement getLoggedInUsername() {
        return driver.findElement(loggedInUsername);
    }
    public WebElement getLogout() {
        return driver.findElement(logout);
    }
    public WebElement getDeleteAcc() {
        return driver.findElement(deleteAcc);
    }

    public WebElement getDeleteAllBooks() {
        scroll(deleteAllBooks);
        return driver.findElement(deleteAllBooks);
    }
    public WebElement getDelAllBooksPopUp() {
        return driver.findElement(deleteAllBooksPopUp);
    }

    public void deleteAllBooksMethod() throws InterruptedException {
        getDeleteAllBooks().click();
        getDelAllBooksPopUp().click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
    }

}
