package com.dydko.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/com/dydko/features",
        glue = "com/dydko/steps",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@smoke5",
        monochrome = true
)


public class CucumberATestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}