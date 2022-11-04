package com.trycloud.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "", //right click on features package, copy path from content root
        glue = "", //right click on stepdef package, copy path from source root
        dryRun = false,
        tags = ""

)

public class CukesRunner {


}
