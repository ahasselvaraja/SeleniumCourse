package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.RedHatProject.RedHatProjectSpecificMethod;

@CucumberOptions(features =
"src/test/java/features/RedHatScenarios/Registration.feature",
glue="stepDefinition.RedHatProject")

public class RedHatRunner extends RedHatProjectSpecificMethod {
	
	

}
