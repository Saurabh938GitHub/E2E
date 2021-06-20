package stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.GreenCartCartPage;
import pageObjects.GreenCartCountryPage;
import pageObjects.GreenCartLandingPage;
import resources.base;

public class GreenCartOrderStepFile extends base {
	WebDriver driver;
	
	GreenCartCountryPage countryPage;

	@When("^User lands on landing page$")
	public void user_lands_on_landing_page() throws Throwable {
		driver=initializeDriver();
		driver.get(getURL());
	}

	@And("^User selects the vegetable$")
	public void user_selects_the_vegetables() throws Throwable {
		GreenCartLandingPage lndPage= new GreenCartLandingPage(driver);
	    lndPage.selectVegetable();
	    lndPage.clickCartIcon();
	}


	@When("^User lands on cart page to place order$")
	public void user_lands_on_cart_page() throws Throwable {
		GreenCartCartPage cartPage=new GreenCartCartPage(driver);
	    cartPage.placeOrder();
	    Thread.sleep(5000);
	}


	@And("^User selects the country and agrees to terms$")
	public void user_selects_the_country_and_agrees_to_terms() throws Throwable {
		countryPage= new GreenCartCountryPage(driver);
		countryPage.selectCountry();
	}

	@Then("^User gets the confirmation$")
	public void user_gets_the_confirmation() throws Throwable {
		countryPage.getConfirmation(); 
		driver.close();
	}
}
