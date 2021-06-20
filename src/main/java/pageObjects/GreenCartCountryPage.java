package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GreenCartCountryPage {
	
	public WebDriver driver;
	
	public GreenCartCountryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By country=By.cssSelector("div.wrapperTwo div select");
	By agreement=By.cssSelector("input.chkAgree");
	By confirmation=By.cssSelector("div.wrapperTwo");
	By proceedButton=By.xpath("//button[text()='Proceed']");
	
	
    public void selectCountry() {
    	WebElement cntry= driver.findElement(country);
    	WebElement agrmnt= driver.findElement(agreement);
    	WebElement proceed= driver.findElement(proceedButton);
    	Select sl=new Select(cntry);
    	sl.selectByIndex(2);
    	agrmnt.click();
    	proceed.click();
		}
    
    public void getConfirmation() {
    System.out.println(driver.findElement(confirmation).getText());
    }

}
