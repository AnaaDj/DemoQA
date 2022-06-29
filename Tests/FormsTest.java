package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Home_Page.BasePage;


public class FormsTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(url);
    }

    @Test
    public void validForm() {
        homepage.getForms().click();
        forms.getPracticeForm().click();
        forms.validForm("Ana", "Djuric", "ana@gmail.com", "0641317728", "Maths","BAC 51");
        Assert.assertTrue(driver.findElement(By.className("modal-content")).isDisplayed());
    }

}
