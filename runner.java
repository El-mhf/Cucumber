package Scenario;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/resources/login.feature" ,
plugin = {"pretty","html:target/htmlReport.html"})
public class runner {

}
