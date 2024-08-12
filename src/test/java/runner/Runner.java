package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  // this syntax takes cucumber class to run the project 

//Cucumber options annotation is used to mention feature file path and step path and glue 

@CucumberOptions(
		
		features ="C:\\Users\\janus\\Documents\\workspace-spring-tool-suite-4-4.23.1.RELEASE\\Ebay_evaluation\\src\\test\\resources\\Ebay\\AdvancedSearch.feature", // path of feature file 
		
		glue="steps"  // package name step definition  
		
		)

public class Runner {

}
