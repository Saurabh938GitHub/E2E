package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RahulShettySelectionPage {
	
	public WebDriver driver;
	
	public RahulShettySelectionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By select=By.xpath("//div[@data-toggle='buttons']/label[2]");
	By enroll=By.cssSelector("button#enroll-button");
	
	
	
    public void sltCourse() throws InterruptedException {
    	driver.findElement(select).click();
    	driver.findElement(enroll).click();
    }
    
  

}
