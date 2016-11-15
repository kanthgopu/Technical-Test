package com.capgemini.hotels.step_def;

import com.capgemini.hotels.page_objects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

/**
 * Created by Gopu on 12/11/2016.
 */
public class Entry {
    HomePage homePage;

    public Entry(HomePage diHomePage) {
        this.homePage = diHomePage;
    }

    @Given("^I log into system with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_log_into_system_with_and(String username, String password) {
        homePage.doLogin(username, password);
    }

    @When("^I provide \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_provide(String hotelName, String address, String owner, String phoneNumber, String email) {
        homePage.provideEntryDetails(hotelName, address, owner, phoneNumber, email);
    }

    @Then("^I should see \"([^\"]*)\" in the list$")
    public void i_should_see_entry_in_the_list(String expectedEntry) {
        Assert.assertThat(homePage.isEntryFound(), hasItem(expectedEntry));
    }

    @When("^I want to delete an \"([^\"]*)\"$")
    public void I_want_to_delete_an(String entry) {
        List<String> list = homePage.isEntryFound();
        int index = list.indexOf(entry);
        homePage.deleteEntry(index);

    }

    @Then("^I should see the \"([^\"]*)\" is deleted$")
    public void I_should_see_the_is_deleted(String expected) {
        Assert.assertThat(homePage.isEntryFound(), not(hasItem(expected)));

    }

}
