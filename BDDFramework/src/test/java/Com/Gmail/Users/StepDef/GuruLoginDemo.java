package Com.Gmail.Users.StepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GuruLoginDemo {
	WebDriver driver;
	@Given("^I navigate to login page for new tours$")

	public void i_navigate_to_login_page_for_new_tours() throws Throwable {
     driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/");

	

	}
	@And("^I entered username and password for new tours$")

	public void i_entered_username_and_password_for_new_tours() throws Throwable {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("123456789");
		pass.clear();
		pass.sendKeys("mercury");

	}

	@But("^Invalid pwd for new tours$")

	public void invalid_pwd_for_new_tours() throws Throwable {

		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("adadada");
		pass.clear();
		pass.sendKeys("mer");

	}


	@And("^I clicked signin button for new tours$")

	public void i_clicked_signin_button_for_new_tours() throws Throwable {
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();

	}


	@Then("^Itas navigated to the HomePage for new tours$")

	public void itas_navigated_to_the_HomePage_for_new_tours() throws Throwable {

		driver.get("https://demo.guru99.com/test/newtours/");

	}
	
	

	}


