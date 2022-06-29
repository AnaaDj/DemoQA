package BookStoreApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Bookstore {
        public WebDriver driver;
        public String url = "https://demoqa.com/books";


    By bookStore = By.className("rt-tr-group");
    By backToBookStore = By.cssSelector(".text-left.fullButton");
    By addToYourCollection = By.cssSelector(".text-right.fullButton");



    public Bookstore(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllBooks(){
        return driver.findElements(bookStore);
    }

    public void addBook(String text) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> list = getAllBooks();
        scroll();
        driver.findElement(By.xpath("//a[text()='"+text+"']")).click();
    }

    public void getAddToCollection(){
        scroll();
        driver.findElement(addToYourCollection).click();
    }

    public void getBackToBookStore(){
        scroll();
        driver.findElement(backToBookStore).click();
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }



}
