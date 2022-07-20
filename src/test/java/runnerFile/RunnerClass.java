package runnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\FeatureFiles\\Adactin.feature",
		glue = "org.stepDefination"
				
		)


public class RunnerClass {

}
