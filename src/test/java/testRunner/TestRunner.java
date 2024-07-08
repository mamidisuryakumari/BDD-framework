package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
glue = {"steps"},
plugin ={"pretty" ,"html:Report1"},
dryRun = false,
tags = "@P1 or @P3 or @P7"

)

public class TestRunner {

}
