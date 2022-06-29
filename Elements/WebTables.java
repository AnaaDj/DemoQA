package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTables {

    public WebDriver driver;

    By add = By.id("addNewRecordButton");
    By registrationForm = By.id("registration-form-modal");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submit = By.id("submit");
    By searchBox = By.id("searchBox");
    By page = By.xpath("//*[contains(@type,\"number\")]");
    By selectRow = By.tagName("select");
    By deleteEntry = By.xpath("//*[contains(@title,\"Delete\")]");
    By editEntry = By.xpath("//*[contains(@title,\"Edit\")]");
    By next = By.xpath("//button[text()=\"Next\"]");
    By previous = By.xpath("//button[text()=\"Previous\"]");

    By allRows = By.className("rt-tr-group");


    public WebTables(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAdd(){
        return driver.findElement(add);
    }
    public WebElement getRegistrationForm(){
        return driver.findElement(registrationForm);
    }
    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }
    public WebElement getLastName(){
        return driver.findElement(lastName);
    }
    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getAge(){
        return driver.findElement(age);
    }
    public WebElement getSalary(){
        return driver.findElement(salary);
    }
    public WebElement getDepartment(){
        return driver.findElement(department);
    }
    public WebElement getSubmit(){
        return driver.findElement(submit);
    }
    public WebElement getSearchBox(){
        return driver.findElement(searchBox);
    }
    public WebElement getPage(){
        return driver.findElement(page);
    }
    public WebElement getSelectRow(){
        return driver.findElement(selectRow);
    }
    public WebElement getDeleteEntry(){
        return driver.findElement(deleteEntry);
    }
    public WebElement getEditEntry(){
        return driver.findElement(editEntry);
    }
    public WebElement getNext(){
        return driver.findElement(next);
    }
    public WebElement getPrevious(){
        return driver.findElement(previous);
    }

    public List<WebElement> getAllRows() {
        return driver.findElements(allRows);
    }




    public void registrationFormMethod(String firstname,String lastName,String email,String age,String salary,String department) {
        getAdd().click();
        getFirstName().sendKeys(firstname);
        getLastName().sendKeys(lastName);
        getEmail().sendKeys(email);
        getAge().sendKeys(age);
        getSalary().sendKeys(salary);
        getDepartment().sendKeys(department);
        getSubmit().click();

    }





}
