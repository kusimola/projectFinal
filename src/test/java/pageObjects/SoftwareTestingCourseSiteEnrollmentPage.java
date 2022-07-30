package pageObjects;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareTestingCourseSiteEnrollmentPage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement FirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement LastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement UsernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement ConfirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement NextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationHeader;


    public SoftwareTestingCourseSiteEnrollmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void inputStringInFields() {
        this.FirstNameField.sendKeys("Imola");
        this.LastNameField.sendKeys("kus");
        this.UsernameField.sendKeys("kusimola");
        this.PasswordField.sendKeys("dasdas");
        this.ConfirmPasswordField.sendKeys("dasdas");
    }

    public void inputFieldOne(String string){this.FirstNameField.sendKeys(string);}

    public void inputFieldTwo(String string){this.LastNameField.sendKeys(string);}

    public void inputFieldThree(String string){this.UsernameField.sendKeys(string);}

    public void inputFieldFour(String string){this.PasswordField.sendKeys(string);}

    public void inputFieldFive(String string){this.ConfirmPasswordField.sendKeys(string);}

    public String getContactInformationHeader() {return this.contactInformationHeader.getText();}

    public String getPersonalInformationHeader() {return this.personalInformationHeader.getText();}

    public void clickOnNextButton(){this.NextButton.submit();}




}