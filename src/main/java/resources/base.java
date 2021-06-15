package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Saurabh\\Bijayini\\E2EProject\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    if(browserName.equalsIgnoreCase("chrome")) {
	    	System.setProperty("webdriver.chrome.driver",
	    			"C:\\Users\\Saurabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

	     driver =new ChromeDriver();
	    	
	    }else if(browserName.equalsIgnoreCase("firefox")) {
	    	
	    } else if(browserName.equalsIgnoreCase("IE")) {
	    	
	    }
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    return driver;
	
	}
	
    public String getURL() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Saurabh\\Bijayini\\E2EProject\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String URL=prop.getProperty("url");
	    return URL;

}
    
    public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException  {
    	TakesScreenshot ts= (TakesScreenshot)driver;
    	File source= ts.getScreenshotAs(OutputType.FILE);
    	LocalDateTime now = LocalDateTime.now();
    	String destinationPath=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
    	File destination= new File(destinationPath);
    	FileUtils.copyFile(source,destination);
    	return destinationPath;
    }
		
}
