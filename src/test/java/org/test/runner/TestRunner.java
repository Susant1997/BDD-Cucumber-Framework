package org.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\susan\\eclipse-workspace\\TestCucumber\\src\\test\\resources\\Feature\\firsttest3.feature"},
					glue = {"org.POM.StepDefinition3", "org.test.Hooks"},

		dryRun = false,
		tags = "@Regression and not @selecthotel and not @booknow and not @logout",
		plugin = {"html:report/WebReport"}
		
		)


public class TestRunner {

}
