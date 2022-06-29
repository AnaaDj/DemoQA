package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinkImages {

    public WebDriver driver;

    By images = By.xpath("//*[contains(@src,\"/images/Toolsqa\")]");
    By validLinks = By.linkText("Click Here for Valid Link");
    By brokenLink = By.linkText("Click Here for Broken Link");


    public BrokenLinkImages(WebDriver driver) {
        this.driver = driver;

    }

    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
        }


        public WebElement getImages() {
            return driver.findElement(images);
        }

        public WebElement getValidLinks() {
        scroll(validLinks);
        return driver.findElement(validLinks);
        }

         public WebElement getBrokenLink() {
         scroll(brokenLink);
         return driver.findElement(brokenLink);
    }

}
