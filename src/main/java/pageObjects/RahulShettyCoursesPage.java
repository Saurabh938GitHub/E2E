package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RahulShettyCoursesPage {
	
	public WebDriver driver;
	
	public RahulShettyCoursesPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.cssSelector("input#search-courses");
	By searchIcon=By.cssSelector("i[class='fa fa-search']");
	By courseList=By.cssSelector("div[class='row course-list list'] div.course-listing");
	
	
	
	
    public void searchCourse() throws InterruptedException {
    	driver.findElement(search).sendKeys("Learn Postman for API Automation");
    	driver.findElement(searchIcon).click();
    }
    
    public void selectCourse() throws InterruptedException {
    	System.out.println("hi");
    	List<WebElement> courses= driver.findElements(courseList);
    	Iterator<WebElement> itr=courses.iterator();
    	while(itr.hasNext()) {
    		WebElement e= itr.next();
    		if(e.isDisplayed()) {
    			e.click();
    			break;
    		}
    		
    		
    	}
  
    }

}
