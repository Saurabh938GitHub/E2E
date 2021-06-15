package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateNavigationBar extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
	@Test()
	public void basePageNavigation2() throws IOException {
	 
	 LandingPage l= new LandingPage(driver);
	 Assert.assertTrue(l.getNavigationBar().isDisplayed());
	 log.info("Navigation Bar is displayed");
	}
	
	@BeforeTest()
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(getURL());
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
