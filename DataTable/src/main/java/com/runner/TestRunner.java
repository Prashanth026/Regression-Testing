package com.runner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"}, glue= {"com.stepdefinition"}, dryRun = true)
public class TestRunner {

}
