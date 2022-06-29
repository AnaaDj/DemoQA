package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RadioButtons {

    public WebDriver driver;

    By radioYes = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]");
    By radioImpressive = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]");
    By radioButtonResponse = By.className("mt-3");


    public RadioButtons(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getRadioYes() {
        return driver.findElement(radioYes);
    }
    public WebElement getRadioImpressive() {return driver.findElement(radioImpressive);}

    public String response() {
        WebElement we = driver.findElement(radioButtonResponse);
        return we.getText();
    }

}
