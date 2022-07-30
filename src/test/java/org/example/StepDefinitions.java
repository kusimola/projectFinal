package org.example;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SoftwareTestingCourseSite;
import pageObjects.SoftwareTestingCourseSiteEnrollmentPage;

public class StepDefinitions {
    private final WebDriver driver = new ChromeDriver();
    private SoftwareTestingCourseSite softwareTestingCourseSite;
    private SoftwareTestingCourseSiteEnrollmentPage softwareTestingCourseSiteEnrollmentPage;

    public StepDefinitions() {
        driver.manage().window().maximize();
        softwareTestingCourseSite = new SoftwareTestingCourseSite(driver);
        softwareTestingCourseSiteEnrollmentPage = new SoftwareTestingCourseSiteEnrollmentPage(driver);
    }


    @Given("I am on the Software testing course website")
    public void i_am_on_the_software_testing_course_website() {
        driver.get ("file:///C:/Users/Public/Documents/github/Testing-Env/index.html#");
    }

    @When("I push the {string} button")
    public void i_push_the_button(String string) {
        softwareTestingCourseSite.clickOnStartEnrollmentButton();
    }

    @Then("the sign up page should appear")
    public void the_sign_up_page_should_appear() {
        Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("software testing | enrollment"));
    }


        @When("I push the Fundamentals {string} button")
        public void i_push_the_fundamentals_button(String string) {
            Utils.scrollToElement(driver, softwareTestingCourseSite.getFundamentalsHeader());
            softwareTestingCourseSite.clickOnReadMoreFundamentalsButton();
        }

        @Then("the Fundamentals page should appear")
        public void the_fundamentals_page_should_appear() {
           Assert.assertTrue(driver.getTitle().toLowerCase().startsWith("fundamentals"));
        }


    @Given("I am on the sign up page of the Software testing course website")
    public void i_am_on_the_sign_up_page_of_the_software_testing_course_website() {
        driver.get ("file:///C:/Users/Public/Documents/github/Testing-Env/routes/enrollment.html");
    }

    @When("I fill in the form with valid data")
    public void i_fill_in_the_form_with_valid_data() {
        softwareTestingCourseSiteEnrollmentPage.inputStringInFields();
    }


        @When("I fill in the First Name field with {string}")
        public void i_fill_in_the_first_name_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldOne(string);
        }

        @And("I fill in the Last Name field with {string}")
        public void i_fill_in_the_last_name_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldTwo(string);
        }


        @And("I fill in the Username field with {string}")
        public void i_fill_in_the_username_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldThree(string);
        }

        @And("I fill in the Password field with {string}")
        public void i_fill_in_the_password_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldFour(string);
        }

        @And("I fill in the Confirm password field with {string}")
        public void i_fill_in_the_confirm_password_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldFive(string);
        }

    @And("click next button")
    public void click_next_button() {
        softwareTestingCourseSiteEnrollmentPage.clickOnNextButton();
    }

    @Then("the Contact information page should appear")
    public void the_contact_information_page_should_appear() {
        Assert.assertEquals("Contact information", softwareTestingCourseSiteEnrollmentPage.getContactInformationHeader());
    }

    @Then("the Personal information page should appear")
    public void the_personal_information_page_should_appear() {
        Assert.assertEquals("Personal information",softwareTestingCourseSiteEnrollmentPage.getPersonalInformationHeader());
    }


        @When("I click the {int} button")
        public void i_click_the_button(Integer int1) {
        Utils.scrollToElement(driver, softwareTestingCourseSite.getFaqHeader());
        SoftwareTestingCourseSite.clickOnFaqButtons1;
        }

        @When("I then click the {int} button")
        public void i_then_click_the_button(Integer int2) {

        }
        @Then("the {int} button should be closed")
        public void the_button_should_be_closed(Integer int1) {

        }
        @Then("the {int} should be expanded")
        public void the_should_be_expanded(Integer int2) {

        }
    @After
    public void cleanUp(){
        driver.quit();
    }

}
