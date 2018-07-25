package HomeTaskPatterns;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class GmailTest {

    private WebDriver driver;

    @BeforeTest(description = "start browser")

    public void StartBrowser() {
        System.setProperty("webdriver.chrome.driver", "d:\\_webdriver\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(description = "mailCreation")
    public void CreateGmail() {

        StartPage startPage = new StartPage(driver);
        startPage.openGmail();
        LogInPage logInPage = startPage.signIn();
        logInPage.fillEmailInput("viktar.kimpel@gmail.com");
        GmailPasswordPage gmailPasswordPage = logInPage.pressNextButton();
        gmailPasswordPage.fillGmailPasswordInput("Imrahil1216");
        GmailMainPage gmailMainPage = gmailPasswordPage.pressNextButton();
        /*gmailMainPage.waitForElementVisible(By.xpath("//div[text()='COMPOSE']"));*/
        Assert.assertTrue(driver.getTitle().contains("viktar.kimpel@gmail.com"),
                "You have not login to your account");
        gmailMainPage.pressComposeButton();
        gmailMainPage.recipientInput("Imrahil1216@inbox.ru");
        gmailMainPage.subjectInput("Test");
        gmailMainPage.bodyInput("Hello, World!");
        gmailMainPage.saveAndCloseButton();
        gmailMainPage.draftButton();
        gmailMainPage.draftButton1();
        gmailMainPage.bodyResult();
        Assert.assertTrue(driver.getTitle().contains("viktar.kimpel@gmail.com"),
                "You have invalid email");
        gmailMainPage.sendButton();
        gmailMainPage.sentMailButton();
        gmailMainPage.draftsButton();
        gmailMainPage.noDraftsButton();
        gmailMainPage.imageButton();
        gmailMainPage.signOutButton();
    }

    @AfterClass(description = "Close browser")

    public void kill(){
        driver.quit();
    }
}
