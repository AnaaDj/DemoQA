package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {

    public WebDriver driver;

    By download = By.id("downloadButton");
    By upload = By.id("uploadFile");


    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }
    public UploadAndDownload(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDownload() {
        return driver.findElement(download);
    }

    public WebElement getUpload() {
        return driver.findElement(upload);
    }


    public void getUpoloadMethod(String path) {
        getUpload().sendKeys(path);
    }









}
