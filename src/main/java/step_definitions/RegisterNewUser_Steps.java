package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class RegisterNewUser_Steps {

    private HomePage homePage;

    public RegisterNewUser_Steps() {
        homePage = new HomePage();

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
    public void user_is_taken_to_prospect_register_page(String string) {

    }

    @Then("user enters email {string} and clicks submit button")
    public void user_enters_email_and_clicks_submit_button(String string) {

    }

    @Then("user is taken to subscription page {string}")
    public void user_is_taken_to_subscription_page(String string) {

    }
}
