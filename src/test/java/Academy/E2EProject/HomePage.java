package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	@Test(dataProvider="getData")
	public void basePageNavigation1(String Username, String Password) throws IOException {
	 
		driver.get(getURL());
	 LandingPage l= new LandingPage(driver);
	 l.getLogin().click();
	 
	 LoginPage lp= new LoginPage(driver);
	 lp.getEmail().sendKeys(Username);
	 lp.getPassword().sendKeys(Password);
	// System.out.println(text);
	 lp.getLogin().click();
	 log.info("Successfully entered username and password");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[2][2];
		data[0][0]="abc@qw.com";
		data[0][1]="123456";
		data[1][0]="xyz@gm.com";
		data[1][1]="234567";

		return data;
	}
	
	@BeforeTest()
	public void initialize() throws IOException {
		driver=initializeDriver();
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
