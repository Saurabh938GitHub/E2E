package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenCartCartPage {
	
	public WebDriver driver;
	
	public GreenCartCartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By placeOrder=By.xpath("//button[text()='Place Order']");
	By coupon=By.cssSelector("button.promoBtn");
	
	
	
    public void placeOrder() {
		driver.findElement(coupon).click();
    	driver.findElement(placeOrder).click();
			
		}
    


}
