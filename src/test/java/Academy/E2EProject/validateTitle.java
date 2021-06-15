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

public class validateTitle extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
    public WebDriver driver;
    
	@Test()
	public void basePageNavigation3() throws IOException {
	
	 LandingPage l= new LandingPage(driver);
	 Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSESdf");
	 l.getTitle().getText();
	 log.info("Successfully validated Text message");
	}
	
	@BeforeTest()
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(getURL());
		log.info("Navigated to Home Page");
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
}
