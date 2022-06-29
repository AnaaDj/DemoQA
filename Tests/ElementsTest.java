package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base_Home_Page.BasePage;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ElementsTest extends BasePage {

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(url);
    }

    //TextBox
    @Test
    public void textBox() {
        homepage.getElements().click();
        elements.getTextBox().click();
        textBox.textBoxCredentials("Ana", "ana@gmail.com", "BAC", "BAC");
        Assert.assertTrue(textBox.getResponse().isDisplayed());
    }

    //CheckBox
    @Test
    public void CheckBoxHome() throws InterruptedException {
        homepage.getElements().click();
        elements.getCheckBox().click();
        Thread.sleep(3000);
        checkBox.getHomeCB().click();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertTrue(result.isDisplayed());
    }

    //Radio Buttons
    @Test
    public void radioButtonsResponse() {
        homepage.getElements().click();
        elements.getRadioButton().click();
        radioButtons.getRadioYes().click();
        String yesResponse = "You have selected Yes";
        Assert.assertEquals(radioButtons.response(),yesResponse);
        radioButtons.getRadioImpressive().click();
        String impressiveResponse = "You have selected Impressive";
        Assert.assertEquals(radioButtons.response(),impressiveResponse);
    }

    //Web Tables
    @Test
    public void registrationForm() {
        homepage.getElements().click();
        elements.getWebTables().click();
        webTables.registrationFormMethod("Ana","Djuric","ana@gmail.com","26","1000","HR");
        Assert.assertTrue(webTables.getAllRows().get(3).isDisplayed());

    }

    @Test
    public void getRowAndDelete() {
        homepage.getElements().click();
        elements.getWebTables().click();
        webTables.registrationFormMethod("Ana","Djuric","ana@gmail.com","26","1000","HR");
        System.out.println(webTables.getAllRows().get(3).getText());
        WebElement delete = driver.findElement(By.id("delete-record-4"));
        delete.click();
        Assert.assertFalse(webTables.getAllRows().get(3).isSelected());

    }
    @Test
    public void getRowAndEdit() {
        homepage.getElements().click();
        elements.getWebTables().click();
        webTables.registrationFormMethod("Ana","Djuric","ana@gmail.com","26","1000","HR");
        System.out.println(webTables.getAllRows().get(2).getText());
        WebElement edit = driver.findElement(By.id("edit-record-3"));
        edit.click();
        WebElement editSubmit = driver.findElement(By.id("submit"));
        editSubmit.submit();
        Assert.assertTrue(webTables.getAllRows().get(2).isDisplayed());

    }

    @Test
    public void selectRow20() {
        homepage.getElements().click();
        elements.getWebTables().click();
        elements.scroll(By.tagName("select"));
        Select row = new Select(driver.findElement(By.tagName("select")));
        List<WebElement> option = row.getOptions();
        for (WebElement we : option) {
            System.out.println(we.getText());
        } row.selectByIndex(2);
        Assert.assertTrue(webTables.getAllRows().size() == 20);
    }


    //Buttons
    @Test
    public void doubleClick() {
        homepage.getElements().click();
        elements.getButtons().click();
        buttons.doubleClickMethod();
        Assert.assertTrue(buttons.getDoubleClickMessage().isDisplayed());
    }

    @Test
    public void rightClick() throws InterruptedException {
        homepage.getElements().click();
        elements.getButtons().click();
        Thread.sleep(1000);
        buttons.rightClickMethod();
        Assert.assertTrue(buttons.getRightClickMessage().isDisplayed());
    }

    @Test
    public void Click() throws InterruptedException {
        homepage.getElements().click();
        elements.getButtons().click();
        Thread.sleep(1000);
        buttons.getClickMe().click();
        Assert.assertTrue(buttons.getClickMeMessage().isDisplayed());
    }

    //Links
    @Test
    public void homelink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getHomeLink().click();
        Set<String> skupTabova = driver.getWindowHandles();
        ArrayList<String> tabovi = new ArrayList<>(skupTabova);
        driver.switchTo().window(tabovi.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @Test
    public void dynamiclink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getDynamicLink().click();
        Set<String> skupTabova = driver.getWindowHandles();
        ArrayList <String> tabovi = new ArrayList<>(skupTabova);
        driver.switchTo().window(tabovi.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }

    @Test
    public void createdlink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getCreated().click();
        String actual = "Link has responded with staus 201 and status text Created";
        Assert.assertEquals(links.getResponse(),actual);
    }

    @Test
    public void NoContentlink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getNoContent().click();
        String actual = "Link has responded with staus 204 and status text No Content";
        Assert.assertEquals(links.getResponse(), actual);
    }

    @Test
    public void MovedLink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getMoved().click();
        String actual = "Link has responded with staus 301 and status text Moved Permanently";
        Assert.assertEquals(links.getResponse(), actual);
    }

    @Test
    public void BadRequestLink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getBadRequest().click();
        String actual = "Link has responded with staus 400 and status text Bad Request";
        Assert.assertEquals(links.getResponse(), actual);
    }

    @Test
    public void UnauthorizedLink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getUnauthorized().click();
        String actual = "Link has responded with staus 401 and status text Unauthorized";
        Assert.assertEquals(links.getResponse(), actual);
    }

    @Test
    public void ForbiddenLink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getForbidden().click();
        String actual = "Link has responded with staus 403 and status text Forbidden";
        Assert.assertEquals(links.getResponse(), actual);
    }

    @Test
    public void NotFoundLink() {
        homepage.getElements().click();
        elements.getLinks().click();
        links.getNotFound().click();
        String actual = "Link has responded with staus 404 and status text Not Found";
        Assert.assertEquals(links.getResponse(), actual);
    }


    //Broken Link - Images
    @Test
    public void validLink() {
        homepage.getElements().click();
        elements.getBrokenLinksImages().click();
        brokenLinkImages.getValidLinks().click();
        String expectedUrl = "https://demoqa.com/";
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    }

    @Test
    public void brokenLink() {
        homepage.getElements().click();
        elements.getBrokenLinksImages().click();
        brokenLinkImages.getBrokenLink().click();
        String brokenURl = "http://the-internet.herokuapp.com/status_codes/500";
        Assert.assertEquals(driver.getCurrentUrl(),brokenURl);
    }

    // Upload and download
    @Test
    public void download() {
        homepage.getElements().click();
        elements.getUploadAndDownload().click();
        uploadAndDownload.getDownload().click();
    }

    @Test
    public void upload() {
        homepage.getElements().click();
        elements.getUploadAndDownload().click();
        uploadAndDownload.getUpoloadMethod("C:\\Users\\anadj\\Desktop\\aaa.jpeg");
    }

    // Dynamic Properties
    @Test
    public void enableAfter() {
        homepage.getElements().click();
        elements.getDynamicProperties().click();
        wdwait.until(ExpectedConditions.elementToBeClickable(dynamicProperties.enableAfter));
        dynamicProperties.getEnableAfter().click();
        Assert.assertTrue(dynamicProperties.getEnableAfter().isEnabled());
    }

    @Test
    public void visibleAfter() {
        homepage.getElements().click();
        elements.getDynamicProperties().click();
        wdwait.until(ExpectedConditions.presenceOfElementLocated(dynamicProperties.visibleAfter));
        dynamicProperties.getVisibleAfter().click();
        Assert.assertTrue(dynamicProperties.getVisibleAfter().isDisplayed());
    }

    @Test
    public void checkColorChangeButton(){
        Assert.assertTrue(dynamicProperties.getColorChange().isDisplayed());
        String s1 = dynamicProperties.getColorChange().getAttribute("class");
        Assert.assertEquals(s1,"mt-4 btn btn-primary");
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));
        String s2 = dynamicProperties.getColorChange().getAttribute("class");
        Assert.assertEquals(s2,"mt-4 text-danger btn btn-primary");
    }

}
