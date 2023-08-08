package steps;

import ThreadLocalUsageSelenium.DriverFactory;
import io.cucumber.java.en.*;
import pages.GoogleHome;

public class CommonSteps {

    GoogleHome googleHome;
    public CommonSteps(){
        googleHome = new GoogleHome(DriverFactory.getDriver());
    }

    @When("I launch google")
    public void i_launch_google() {
        // Write code here that turns the phrase above into concrete actions
        googleHome.launchApplication();

    }
    @When("I search for BDD")
    public void i_search_for_bdd() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("I search for TDD")
    public void i_search_for_tdd() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I should see BDD related articles")
    public void i_should_see_bdd_related_articles() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should see TDD related articles")
    public void i_should_see_tdd_related_articles() {
        // Write code here that turns the phrase above into concrete actions

    }

}
