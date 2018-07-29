package com.radical.basic.Demo1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/java/radical/basic/Demo1/OneFolder.feature"}, 
		
		glue={"com/radical/basic/Demo1/"}
		
		)
public class RunOneFolderStepDefsTest {
	
	
	
	

}
