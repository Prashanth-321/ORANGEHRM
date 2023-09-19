import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".//Feuture/loginhrm.feature",
	glue= "StepDefinations/loginstepshrm",
	dryRun= true,
	publish = true
			
	
)
public class TestRun {
	
	
}
