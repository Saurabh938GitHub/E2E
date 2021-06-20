package pageObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GreenCartLandingPage {
	
	public WebDriver driver;
	
	public GreenCartLandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By vegName=By.cssSelector("selectVegetable");
	By vegList=By.cssSelector("div.products div.product");
	By checkOutButton=By.cssSelector("div[class='cart-preview active'] div.action-block button");
	By cartButton=By.cssSelector("a.cart-icon");
	
	
	public void selectVegetable1() {
    	int j = 0; 
    	List<WebElement> li = driver.findElements(By.cssSelector("div[class='product'] h4"));
		String[] veg = { "Brocolli", "Beetroot", "Beans" };

		for (int i = 0; i < li.size(); i++) {
			WebElement a = li.get(i);
			String name = a.getText();
			String name1 = "";
			String[] name2 = a.getText().split("-");
			name1 = name2[0].trim();

			List<String> x = Arrays.asList(veg);

			if (x.contains(name1)) {
				driver.findElements(By.cssSelector("div[class='product'] div[class='product-action'] button")).get(i)
						.click();
				;

				j++;

				if (j == veg.length) {
					break;
				}
			}
			}
		}
    
	public void selectVegetable2() {
    	int j = 0; 
    	List<WebElement> li = driver.findElements(By.cssSelector("div[class='product'] h4"));
		String[] veg = { "Cucumber", "Brinjal", "Carrot","Corn" };

		for (int i = 0; i < li.size(); i++) {
			WebElement a = li.get(i);
			String name = a.getText();
			String name1 = "";
			String[] name2 = a.getText().split("-");
			name1 = name2[0].trim();

			List<String> x = Arrays.asList(veg);

			if (x.contains(name1)) {
				driver.findElements(By.cssSelector("div[class='product'] div[class='product-action'] button")).get(i)
						.click();
				;

				j++;

				if (j == veg.length) {
					break;
				}
			}
			}
		}
	
    public void clickCartIcon() throws InterruptedException {
    	driver.findElement(cartButton).click();
    	driver.findElement(checkOutButton).click();
  
    }

}
