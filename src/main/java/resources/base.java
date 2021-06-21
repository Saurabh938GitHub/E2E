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
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    //String browserName=System.getProperty("browser");
	    String browserName=prop.getProperty("browser");
	    if(browserName.contains("chrome")) {
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        if(browserName.contains("headless"))
        options.addArguments("headless");
	     driver =new ChromeDriver(options);
	    	
	    }else if(browserName.equalsIgnoreCase("firefox")) {
	    	
	    } else if(browserName.equalsIgnoreCase("IE")) {
	    	
	    }
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    
	    return driver;
	
	}
	
    public String getURL() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String URL=prop.getProperty("url");
	    return URL;

}
    
public String getURL1() throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String URL=prop.getProperty("url1");
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
