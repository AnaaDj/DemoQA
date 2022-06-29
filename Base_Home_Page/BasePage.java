package Base_Home_Page;

import BookStoreApp.Bookstore;
import BookStoreApp.Login;
import BookStoreApp.Profile;
import Elements.*;
import Forms.Forms;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;


public class BasePage {
    public final String url = "https://demoqa.com/";
    public WebDriverManager wdm;

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Actions actions;
    public HomePage homepage;
    public Elements elements;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButtons radioButtons;
    public WebTables webTables;
    public Buttons buttons;
    public Links links;
    public BrokenLinkImages brokenLinkImages;
    public UploadAndDownload uploadAndDownload;
    public DynamicProperties dynamicProperties;
    public Forms forms;
    public Login login;
    public Profile profile;
    public Bookstore bookstore;



    @BeforeClass
    public void beforeClass() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        actions = new Actions(driver);
        homepage = new HomePage(driver);
        elements = new Elements(driver);
        textBox = new TextBox(driver);
        checkBox = new CheckBox(driver);
        radioButtons = new RadioButtons(driver);
        webTables = new WebTables(driver);
        buttons = new Buttons(driver,actions);
        links = new Links(driver);
        brokenLinkImages = new BrokenLinkImages(driver);
        uploadAndDownload = new UploadAndDownload(driver);
        dynamicProperties = new DynamicProperties(driver,wdwait);
        forms = new Forms(driver,wdwait,actions);
        login = new Login(driver);
        profile = new Profile(driver);
        bookstore = new Bookstore(driver);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}
