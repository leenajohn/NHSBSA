package StepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/java/features/KnowHelp.feature",
		//tags = {"@Regression"},
		glue = {"StepDefs"}
		 
		)
public class TestRunner {

}
