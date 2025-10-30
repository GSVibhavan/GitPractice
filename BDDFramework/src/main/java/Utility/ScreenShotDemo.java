package Utility;

import java.io.IOException;
import java.io.File;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class ScreenShotDemo{
 WebDriver driver;
	
	public void screen2(WebDriver driver)
	{		
		this.driver= driver;
		try {
			Date date= new Date();
			DateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			String time= df.format(date);
			
			File x =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File y= new File(".\\src\\test\\java\\Reports\\img"+time+ ".png");
			FileUtils.copyFile(x, y);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		}
	
	public WebDriver setup(String browser)
	{
		switch(browser)
		{
		case "chrome":
			 driver = new ChromeDriver();
			 break;
		case "firefox":
			 driver = new FirefoxDriver();
			 break;
		case "safari":
			 driver = new SafariDriver();
			 break;
		case "edge":
			 driver = new EdgeDriver();
			 break;
			 default:
				 System.out.println("Invalid Browser found");
		}

		return driver;
	}
	
	  
 

}
