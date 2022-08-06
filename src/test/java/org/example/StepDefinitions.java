package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

    @When("I fill in the Email field with {string}")
    public void i_fill_in_the_email_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.getContactInformationHeader();
        softwareTestingCourseSiteEnrollmentPage.inputFieldOne(string);

    }

    @When("I fill in the Phone field with {string}")
    public void i_fill_in_the_phone_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldTwo(string);

    }

    @When("I fill in the Country field with {string}")
    public void i_fill_in_the_country_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldThree(string);

    }

    @When("I fill in the City field with {string}")
    public void i_fill_in_the_city_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldFour(string);

    }

    @When("I fill in the PostCode field with {string}")
    public void i_fill_in_the_post_code_field_with(String string) {
        softwareTestingCourseSiteEnrollmentPage.inputFieldFive(string);

    }

    @When("click Contact informations next button")
    public void click_contact_informations_next_button() {
            softwareTestingCourseSiteEnrollmentPage.clickOnNextButton2();


    }

    @Then("the Course Options page should appear")
    public void the_course_options_page_should_appear() {
        Assert.assertEquals("Course options",softwareTestingCourseSiteEnrollmentPage.getCourseOptionHeader());
    }


        @When("I click the {int} button")
        public void i_click_the_button(int number) {
            Utils.scrollToElement(driver, softwareTestingCourseSite.getFaqHeader());
            softwareTestingCourseSite.clickOnQuestionButton(number);
        }

        @And("I click the <int> button")
        public void I_click_the_button(int number){
        softwareTestingCourseSite.clickOnQuestionButton(number);
        }

        @Then("the {int} button should be closed")
        public void the_button_should_be_closed(int number) {
        softwareTestingCourseSite.clickOnQuestionButton(number);
        }

        @Then("the {int} should be expanded")
        public void the_should_be_expanded(int number) {
        softwareTestingCourseSite.clickOnQuestionButton(number);
        }

        @Then("the {int} button should expand and the page dynamically rearrange itself")
        public void the_button_should_expand_and_the_page_dynamically_rearrange_itself(int number) {
        softwareTestingCourseSite.clickOnQuestionButton(number);

        }

        @When("I click {int} button that is already expanded")
        public void i_click_button_that_is_already_expanded(int number) {
            softwareTestingCourseSite.clickOnQuestionButton(number);
        }

        @Then("the {int} button should revert back to the initial state")
        public void the_button_should_revert_back_to_the_initial_state(int number) {
            softwareTestingCourseSite.clickOnQuestionButton(number);
        }




    @When("I click an options from the Course Options list")
    public void i_click_an_options_from_the_course_options_list() {

    }

    @When("the bullet turns blue")
    public void the_bullet_turns_blue() {

    }

    @When("click Course Options next button")
    public void click_course_options_next_button() {

    }

    @Then("the Payment information page should appear")
    public void the_payment_information_page_should_appear() {

    }




    @When("I fill in the card holder name with {string}")
    public void i_fill_in_the_card_holder_name_with(String string) {

    }

    @When("I fill in the Crad number field with {string}")
    public void i_fill_in_the_crad_number_field_with(String string) {

    }

    @When("I fill in the CVC field with {string}")
    public void i_fill_in_the_cvc_field_with(String string) {

    }

    @When("I select a month from expiry date {string}")
    public void i_select_a_month_from_expiry_date(String string) {

    }

    @When("I select a year from expiry date {string}")
    public void i_select_a_year_from_expiry_date(String string) {

    }

    @When("click Payment information next button")
    public void click_payment_information_next_button() {

    }

    @Then("the Success page should appear")
    public void the_success_page_should_appear() {

    }





    @When("I click the {string} button")
    public void i_click_the_button(String string) {

    }

    @Then("the Software testing course website's homepage should appear")
    public void the_software_testing_course_website_s_homepage_should_appear() {

    }




    @When("I complete the newsletter field with a email")
    public void i_complete_the_newsletter_field_with_a_email() {

    }

    @When("click submit button")
    public void click_submit_button() {

    }

    @Then("a pop up window appears with te message {string}")
    public void a_pop_up_window_appears_with_te_message(String string) {

    }


    @When("I complete the newsletter field with a text {string}")
    public void i_complete_the_newsletter_field_with_a_text(String string) {

    }

    @Then("a red outline should appear around the field")
    public void a_red_outline_should_appear_around_the_field() {

    }


    @After
    public void cleanUp(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "name");
        }
        driver.quit();
    }

}
