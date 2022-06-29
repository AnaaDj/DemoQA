package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Home_Page.BasePage;

public class BookstoreTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(url);
    }

    @Test
    public void bookstoreLogin() throws InterruptedException {
        homepage.getBookStoreApplication().click();
        login.loginMethod("AnaDj", "AnaDj5119%");
        Thread.sleep(1000);
        String urlProfile = "https://demoqa.com/profile";
        Assert.assertEquals(driver.getCurrentUrl(),urlProfile);
    }

    @Test
    public void logOut() throws InterruptedException {
        homepage.getBookStoreApplication().click();
        login.validLogin();
        login.getLogout().click();
        Assert.assertEquals(driver.getCurrentUrl(),login.url);
    }

    @Test
    public void InvalidCredentials() throws InterruptedException {
        login.loginMethod("AnaDj", "Ana");
        Thread.sleep(1000);
        Assert.assertTrue(login.getErrorMessage().isDisplayed());
        Assert.assertEquals(login.getErrorMessage().getText(),"Invalid username or password!");
    }

    @Test
    public void viewProfile() throws InterruptedException {
        login.validLogin();
        Thread.sleep(1000);
        driver.navigate().to("https://demoqa.com/login");
        login.getViewProfile().click();
        Assert.assertEquals(driver.getCurrentUrl(),profile.url);
    }


    @Test
    public void deleteAllBooks() throws InterruptedException {
        login.validLogin();
        Thread.sleep(1000);
        profile.deleteAllBooksMethod();


    }
    @Test
    public void addBook() throws InterruptedException {
        login.validLogin();
        Thread.sleep(1000);
        profile.scroll(By.id("gotoStore"));
        profile.getGoToBookstore().click();
        bookstore.addBook("Learning JavaScript Design Patterns");
        bookstore.getAddToCollection();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        bookstore.getBackToBookStore();
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/books");
    }

}
