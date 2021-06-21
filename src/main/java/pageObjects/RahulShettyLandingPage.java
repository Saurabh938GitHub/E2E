package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RahulShettyLandingPage {
	
	public WebDriver driver;
	
	public RahulShettyLandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By courses=By.xpath("//div[@class='header-upper']//a[text()='Courses']");
	
	
    public void clickCourse() throws InterruptedException {
    	driver.findElement(courses).click();
  
    }

}
