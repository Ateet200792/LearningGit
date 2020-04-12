package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Acer i3\\eclipse-workspace\\Amazon\\src\\main\\java\\feature\\feature.feature",
glue="stepDefinition",
dryRun=false
)

public class TestRunner {

}
