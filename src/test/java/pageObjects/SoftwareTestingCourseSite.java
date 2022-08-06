package pageObjects;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareTestingCourseSite {

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement StartEnrollmentButton;


    //Fundamentals section - locators
    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement ReadMoreFundamentalsButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    //Faq section - locators
    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement FaqHeader;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement FaqFirstAccordion;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[2]/h3/button")
    private  WebElement FaqSecondAccordion;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[3]/h3/button")
    private WebElement FaqThirdAccordion;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement FaqFourthButton;

    @FindBy(className = ".accordion-flush")
    private WebElement FaqSection;





    public SoftwareTestingCourseSite(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void clickOnStartEnrollmentButton() {
        this.StartEnrollmentButton.click();
    }

    public void clickOnReadMoreFundamentalsButton() {
        this.ReadMoreFundamentalsButton.click();
    }

    public WebElement getFundamentalsHeader() {
        return this.fundamentalsHeader;
    }

    public WebElement getFaqHeader() {
        return this.FaqHeader;
    }

    public void clickOnFaqButtons1(){this.FaqFirstAccordion.click();}

    public void clickOnFaqButtons2(){this.FaqSecondAccordion.click();}

    public void clickOnFaqButtons3(){this.FaqThirdAccordion.click();}

    public void clickOnFaqButtons4(){this.FaqFourthButton.click();}


    // private WebElement nextButton(int index){return driver findElements(By.className("next-btn")).get(index);}
    private WebElement selectQuestionFromFaq(int questionNumber) {
        return FaqSection.findElements(By.cssSelector(".accordion-item")).get(questionNumber);
    }

    private WebElement getQuestionButton(int questionNumber) {
        WebElement element = selectQuestionFromFaq(questionNumber);
        return element.findElement(By.cssSelector(" h3 > button"));
    }

    public void clickOnQuestionButton(int questionNumber) {
        WebElement element = getQuestionButton(questionNumber);
        element.click();
    }




}