package com.dydko.runners;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/com/dydko/features",
        glue = "com/dydko/steps",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@smoke2",
        monochrome = true
)


public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        System.out.println("testng!!!!!!!!!!!!!!!!!");
        return super.scenarios();
    }
}