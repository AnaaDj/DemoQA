package Forms;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Forms {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;

    By practiceForm = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");

    By maleButton = By.id("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]");
    By femaleButton = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]");
    By otherButton = By.id("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]");

    By phoneNumber = By.id("userNumber");
    By date = By.id("dateOfBirthInput");
    By subjects = By.id("subjectsInput");

    By sports =  By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]/label[1]");
    By reading =  By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]/label[1]");
    By music =  By.id("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]/label[1]");

    By picture = By.id("uploadPicture");
    By currentA = By.id("currentAddress");
    By states = By.id("react-select-3-input");
    By cities = By.id("react-select-4-input");

    By submit = By.id("submit");



    public Forms(WebDriver driver,WebDriverWait wdwait,Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPracticeForm() {
        return driver.findElement(practiceForm);
    }


    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }
    public WebElement getLastName() {
        return driver.findElement(lastName);
    }
    public WebElement getEmail() {
        return driver.findElement(email);
    }
    public WebElement getMaleButton() {
        return driver.findElement(maleButton);
    }
    public WebElement getFemaleButton() {
        return driver.findElement(femaleButton);
    }
    public WebElement getOtherButton() {
        return driver.findElement(otherButton);
    }
    public WebElement getPhone() {
        return driver.findElement(phoneNumber);
    }
    public WebElement getDate() {
        return driver.findElement(date);
    }
    public WebElement getSubjects() {
        return driver.findElement(subjects);
    }
    public WebElement getSports() {
        return driver.findElement(sports);
    }
    public WebElement getReading() {
        return driver.findElement(reading);
    }
    public WebElement getMusic() {
        return driver.findElement(music);
    }
    public WebElement getPicture() {return driver.findElement(picture);}
    public WebElement getCurrentAddress() {
        return driver.findElement(currentA);
    }
    public WebElement getStates() {
        return driver.findElement(states);
    }
    public WebElement getCities() {
        return driver.findElement(cities);
    }
    public WebElement getSubmit() {
        return driver.findElement(submit);
    }


    public void dateSendKeys(By locator, String date) {
        wdwait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(Keys.chord(Keys.CONTROL, "a"), date);
    }

    public void zoomOut() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom = '50%';");
    }

    public void scroll(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(locator));
    }


    public void getStateMethod() {
        scroll(states);
        WebElement state = driver.findElement(states);
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);
    }

    public void getCityMethod(String city) {
        scroll(cities);
        WebElement state = driver.findElement(cities);
        state.sendKeys(city);
        state.sendKeys(Keys.ENTER);
    }

    public void sendSubject(String s) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getSubjects()).click().sendKeys(s).sendKeys(Keys.ENTER).build().perform();
    }


    public void uploadPic() {
       getPicture().sendKeys("C:\\Users\\anadj\\Desktop\\aaa.jpeg");
    }


    public void validForm(String fName, String lName, String email,String phone, String subject, String currentA) {
        getFirstName().sendKeys(fName);
        getLastName().sendKeys(lName);
        getEmail().sendKeys(email);
        getFemaleButton().click();
        getPhone().sendKeys(phone);
        dateSendKeys(date, "24 february 1996");
        sendSubject(subject);
        getSports().click();
        getCurrentAddress().sendKeys(currentA);
        zoomOut();
        getStateMethod();
        getCityMethod("N");
        uploadPic();
        getSubmit().submit();
    }

}




