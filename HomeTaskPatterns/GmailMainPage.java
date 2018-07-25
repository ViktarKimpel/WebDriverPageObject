package HomeTaskPatterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GmailMainPage extends AbstractedPage {

    private static final By COMPOSE_BUTTON_LOCATOR = By.xpath("//div[text()='COMPOSE']");
    private static final By RECIPIENT_INPUT_LOCATOR = By.xpath("//textarea[@name='to']");
    private static final By SUBJECT_INPUT_LOCATOR = By.xpath("//div[@class='aoD az6']/input[@placeholder='Subject']");
    private static final By BODY_INPUT_LOCATOR = By.xpath("//div[@class='Am Al editable LW-avf']");
    private static final By SAVE_AND_CLOSE_BUTTON_LOCATOR = By.xpath("//td[@class='Hm']/img[@class='Ha']");
    private static final By DRAFT_BUTTON_LOCATOR = By.xpath(
            "//span[@class='nU n1']/a[@href='https://mail.google.com/mail/u/0/#drafts']");
    private static final By DRAFT_BUTTON1_LOCATOR = By.xpath("//div[@class='yW']/font[@color='#DD4B39']");
    private static final By BODY_RESULT_LOCATOR = By.xpath("//div[text()='Hello, World!']");
    private static final By SEND_BUTTON_LOCATOR = By.xpath("//div[text()='Send']");
    private static final By SENT_MAIL_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#sent']");
    private static final By DRAFTS_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/u/0/#drafts']");
    private static final By NO_DRAFTS_LOCATOR = By.xpath("//td[@class='TC']");
    private static final By IMAGE_BUTTON_LOCATOR = By.xpath(
            "//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']");
    private static final By SIGN_OUT_BUTTON_LOCATOR = By.xpath("//a[text()='Sign out']");

    public GmailMainPage (WebDriver driver)
    {
        super(driver);
        waitForElementVisible(COMPOSE_BUTTON_LOCATOR);
    }

    public void pressComposeButton (){
        waitForElementVisible(COMPOSE_BUTTON_LOCATOR);
        driver.findElement (COMPOSE_BUTTON_LOCATOR).click();
    }
    public void recipientInput (String recipientquery){
        waitForElementVisible(RECIPIENT_INPUT_LOCATOR);
        driver.findElement(RECIPIENT_INPUT_LOCATOR).click();
        WebElement input = driver.findElement(RECIPIENT_INPUT_LOCATOR) ;
        input.sendKeys(recipientquery);
    }
    public void subjectInput (String subjectquery){
        waitForElementVisible(SUBJECT_INPUT_LOCATOR);
        WebElement input = driver.findElement(SUBJECT_INPUT_LOCATOR) ;
        input.sendKeys(subjectquery);
    }
    public void bodyInput (String bodyquery){
        waitForElementVisible(BODY_INPUT_LOCATOR);
        driver.findElement(BODY_INPUT_LOCATOR).click();
        WebElement input = driver.findElement(BODY_INPUT_LOCATOR) ;
        input.sendKeys(bodyquery);
    }

    public void saveAndCloseButton (){
        waitForElementVisible(SAVE_AND_CLOSE_BUTTON_LOCATOR);
        driver.findElement (SAVE_AND_CLOSE_BUTTON_LOCATOR).click();
    }

    public void draftButton (){
        waitForElementVisible(DRAFT_BUTTON_LOCATOR);
        driver.findElement (DRAFT_BUTTON_LOCATOR).click();
    }
    public void draftButton1 (){
        waitForElementVisible(DRAFT_BUTTON1_LOCATOR);
        driver.findElement (DRAFT_BUTTON1_LOCATOR).click();
    }

    public void bodyResult (){
        waitForElementVisible(BODY_RESULT_LOCATOR);
        driver.findElement (BODY_RESULT_LOCATOR);
    }
    public void sendButton (){
        waitForElementVisible(SEND_BUTTON_LOCATOR);
        driver.findElement (SEND_BUTTON_LOCATOR).click();
    }

    public void sentMailButton (){
        waitForElementVisible(SENT_MAIL_BUTTON_LOCATOR);
        driver.findElement (SENT_MAIL_BUTTON_LOCATOR).click();
    }

    public void draftsButton (){
        waitForElementVisible(DRAFTS_BUTTON_LOCATOR);
        driver.findElement (DRAFTS_BUTTON_LOCATOR).click();
    }
    public void noDraftsButton (){
        waitForElementVisible(NO_DRAFTS_LOCATOR);
        driver.findElement (NO_DRAFTS_LOCATOR).click();
    }
    public void imageButton (){
        waitForElementVisible(IMAGE_BUTTON_LOCATOR);
        driver.findElement (IMAGE_BUTTON_LOCATOR).click();
    }
    public void signOutButton (){
        waitForElementVisible(SIGN_OUT_BUTTON_LOCATOR);
        driver.findElement (SIGN_OUT_BUTTON_LOCATOR).click();
    }

}
