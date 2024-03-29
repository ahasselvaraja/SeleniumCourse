package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefinition.ProjectSpecificMethod;

@CucumberOptions(features = 
        "src/test/java/features/LeadsScenarios/CreateLead.feature" 
//		"src/test/java/features/EditLead.feature",
//		"src/test/java/features/DuplicateLead.feature",
//		"src/test/java/features/MergeLead.feature" , 
//		"src/test/java/features/DeleteLead.feature" 
		 ,
                  glue = "stepDefinition")

public class LeadsParameterRunner extends ProjectSpecificMethod {

}
