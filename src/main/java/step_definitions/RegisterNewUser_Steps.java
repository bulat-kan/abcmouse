package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.ProspectRegisterPage;
import pages.SubscriptionPage;
import utils.ConfigReader;

public class RegisterNewUser_Steps {

    private HomePage homePage;
    private ProspectRegisterPage prospectRegisterPage;
    private SubscriptionPage subscriptionPage;

    public RegisterNewUser_Steps() {
        homePage = new HomePage();
        prospectRegisterPage = new ProspectRegisterPage();
        subscriptionPage = new SubscriptionPage();
    }

    @Given("user is on homepage")
    public void user_is_on_homepage() {
        homePage.navigateToHomePage();
    }

    @When("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        homePage.signUP();
    }

    @Then("user is taken to prospect register page {string}")
    public void user_is_taken_to_prospect_register_page(String expectedURL) {
        Assert.assertEquals(expectedURL, prospectRegisterPage.getCurrentUrl());
        System.out.println("Expected url:" + expectedURL + "\nActual url :" + prospectRegisterPage.getCurrentUrl());
        System.out.println("-------------------------------");
    }

    @Then("user enters email and clicks submit button")
    public void userEntersEmailAndClicksSubmitButton() {
        prospectRegisterPage.submitEmail(ConfigReader.getProperty("email"));

    }

    @Then("user is taken to subscription page {string}")
    public void user_is_taken_to_subscription_page(String expectedURL) {
        Assert.assertEquals(expectedURL, subscriptionPage.getCurrentUrl());
        System.out.println("Expected url:" + expectedURL + "\nActual url :" + subscriptionPage.getCurrentUrl());
        System.out.println("-------------------------------");

    }

    @Then("on subscription page {string} is displayed")
    public void onSubscriptionPageIsDisplayed(String expectedMessage) {
        Assert.assertEquals(expectedMessage,subscriptionPage.getMessage());
        System.out.println("Expected message:" + expectedMessage + "\nActual message :" + subscriptionPage.getMessage());
    }



}
