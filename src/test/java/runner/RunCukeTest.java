package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html"},features="src/test/resources/features", glue="stepDefinitions", monochrome=true)
public class RunCukeTest {
	
	

}
