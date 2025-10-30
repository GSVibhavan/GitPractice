package Com.Gmail.Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = ".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\logintable.feature",
		glue = "Com.Gmail.Users.StepDef",
		plugin = {"pretty", "html:Reports/cucumber-reports.html"})

public class TestRunner2 extends AbstractTestNGCucumberTests{
 
}
