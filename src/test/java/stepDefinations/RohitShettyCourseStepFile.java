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
import pageObjects.RahulShettyBillingPage;
import pageObjects.RahulShettyCoursesPage;
import pageObjects.RahulShettyLandingPage;
import pageObjects.RahulShettySelectionPage;
import resources.base;

public class RohitShettyCourseStepFile extends base {
	WebDriver driver;
	
	RahulShettyLandingPage rsLandingPage;
	RahulShettyCoursesPage rsCoursesPage;
	RahulShettySelectionPage rsSelectionPage;
	RahulShettyBillingPage rsBillingPage;

	@When("^User lands on landing page of RSAcademy$")
	public void user_lands_on_landing_page_RSAcademy() throws Throwable {
		driver=initializeDriver();
		driver.get(getURL1());
		rsLandingPage= new RahulShettyLandingPage(driver);
		rsLandingPage.clickCourse();
	}
	
	@And("^User searches and selects the course$")
	public void user_searches_and_selects_the_course() throws Throwable {
		rsCoursesPage= new RahulShettyCoursesPage(driver);
		rsCoursesPage.searchCourse();
		rsCoursesPage.selectCourse();
	}
	
	@And("^User selects the package to enroll in course$")
	public void user_selects_the_package_to_enroll_in_course() throws Throwable {
		rsSelectionPage= new RahulShettySelectionPage(driver);
		rsSelectionPage.sltCourse();
	}
	
	@Then("^User fills information$")
	public void user_fills_information() throws Throwable {
		rsBillingPage= new RahulShettyBillingPage(driver);
		rsBillingPage.fillInfo();
		driver.close();
	}

	
}
