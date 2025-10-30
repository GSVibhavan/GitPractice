package Com.Gmail.Users.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Gmail.Users.Config.reports;

public class UserInteraction2 {
	WebDriver driver;
	private ExtentTest test;
	private WebDriverWait wait;
public UserInteraction2(WebDriver driver,ExtentTest test) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		this.test = test;
	}
@FindBy(name= "userName")
private WebElement userName;

@FindBy(name="password")
private WebElement password;

@FindBy (name = "submit")
private WebElement submit;

@FindBy(xpath = "//h3[normalize-space()='Login Successfully']")
private WebElement login;

@FindBy (xpath = "//span[normalize-space()='Enter your userName and password correct']")
private WebElement error;
 
//	public void login() {
//
//		driver =new ChromeDriver();
//	}
 
	public void enterdetails(String s1,String s2) {
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(userName));
			reports.generateReport(driver, test, Status.PASS, "Username and Passwrod found");
		userName.sendKeys(s1);
		wait.until(ExpectedConditions.visibilityOf(password));
		reports.generateReport(driver, test, Status.PASS, "Username and Passwrod found");
		password.sendKeys(s2);
	}catch(TimeoutException te) {
		actResult = false;
		reports.generateReport(driver, test, Status.FAIL, "Username and Password is not found");
	}
	}
 
	public void sigin() {
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOf(submit));
			reports.generateReport(driver, test, Status.PASS, "Click button found");
			submit.click();
	}catch(TimeoutException te) {
		actResult = false;
		reports.generateReport(driver, test, Status.FAIL, "Click button is not found");
	}
	}
	public boolean navigation(String s1) {
	boolean actResult = true;
	try {
          wait.until(ExpectedConditions.visibilityOf(login));
		if(login.getText().matches("Login Successfully")) {
		reports.generateReport(driver, test, Status.PASS, "valid user");
		
		}else {
			 actResult = false;
		   reports.generateReport(driver, test, Status.FAIL, "Invalid user");
		}
	}
	catch(TimeoutException te) {
		actResult = false;
		reports.generateReport(driver, test, Status.FAIL, "password is wrong");
	}
	return actResult;
}
}
