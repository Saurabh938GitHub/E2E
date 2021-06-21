package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RahulShettyBillingPage {
	
	public WebDriver driver;
	
	public RahulShettyBillingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By coupon=By.cssSelector("button[data-test='add-coupon-button']");
	By couponValue=By.cssSelector("input[data-test='apply-input']");
	By nameCard=By.cssSelector("input[data-testid='credit-card-name']");
	By numberCard=By.cssSelector("div#cardNumber input");
	By expiryDate=By.cssSelector("div#cardExpiration");
	By cvcCode=By.cssSelector("div#cardCvc");
	By address1=By.cssSelector("input#billingStreetAddressLine1");
	By city=By.cssSelector("input#billingCity");
	By postalCode=By.cssSelector("input#billingPostalCode");
	By buyNow=By.cssSelector("div[role='none'] button[data-test='confirm-enroll']");
	
	
    public void fillInfo() throws InterruptedException {
    	String script = "arguments[0].value=arguments[1]";
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.findElement(coupon).click();
    	driver.findElement(couponValue).sendKeys("Saurabh");
    	driver.findElement(nameCard).sendKeys("Saurabh Mishra");
    	System.out.println("Done");
    	//driver.findElement(numberCard).sendKeys("6069 8600 0908 5509");
//    	js.executeScript(script, driver.findElement(numberCard), "6069 8600 0908 5509");
//    	driver.findElement(numberCard).sendKeys(" ");
//    	driver.findElement(expiryDate).sendKeys("0221");
//    	driver.findElement(cvcCode).sendKeys("555");
//    	driver.findElement(address1).sendKeys("hw hwgdvcwg");
//    	driver.findElement(city).sendKeys("hw hwgdvcwg");
//    	driver.findElement(postalCode).sendKeys("hw hwgdvcwg");
//    	Assert.assertTrue(driver.findElement(buyNow).isEnabled());
    	
    }
    
  

}
