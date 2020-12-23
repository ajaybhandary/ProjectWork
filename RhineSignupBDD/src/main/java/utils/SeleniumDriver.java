package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	//init WebDriver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;


	private SeleniumDriver() 
	{
		System.setProperty("Webdrive.chrome.driver" , System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void openPage(String url)
	{
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() 
	{
		if(seleniumDriver==null)
		{
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	

	public static void tearDown()
	{
		if(driver !=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
}
