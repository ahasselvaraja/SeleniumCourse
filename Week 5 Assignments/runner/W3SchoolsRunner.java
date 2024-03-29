package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.W3schools.W3SchoolProjectSpecificMethod;

@CucumberOptions(features =
"src/test/java/features/W3SchoolScenarios/W3School.feature",
glue="stepDefinition.W3schools")


	

public class W3SchoolsRunner extends W3SchoolProjectSpecificMethod{

	
}
