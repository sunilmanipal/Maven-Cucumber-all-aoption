package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login.feature"},
glue={"StepDefinition"},//This is to run the step files 
monochrome=true,//to make the console output in a better format
dryRun=false,//to check all the methods have been implemented properly
strict=true, //To check did i miss any steps is all fine in the step definition
plugin = {"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)
public class Test_Runner {

}
