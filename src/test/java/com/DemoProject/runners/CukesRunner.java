package com.DemoProject.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","json:target/json-report/cucumber.json"},
        glue = "com/DemoProject/step_definitions",
        features = "src/test/resources/features",
        //"json:target/cucumber.json",
        publish = true,
        tags = "@Demo",
        dryRun =false

)
public class CukesRunner {

}