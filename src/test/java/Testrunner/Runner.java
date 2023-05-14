package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\features",glue ={"Stepdefintion","Hooks"},
tags = "@TC100",plugin = {"pretty","html:target\\report\\report.html","json:target\\report\\Adactin_Jreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun=false)

public class Runner {

}
