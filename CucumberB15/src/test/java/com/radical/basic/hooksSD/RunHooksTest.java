package com.radical.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,
					dryRun=true,//it will check if it has all respective step defination is missing
					
					features= {"src/test/resources/java/radical/basic/hooksFF/"},
					glue={"com/radical/basic/hooksSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report5.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
			
			)
	
	public class RunHooksTest {	
	

}
