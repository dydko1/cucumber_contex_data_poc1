// src/test/java/com/example/cucumber/runner/RunCucumberTest.java
package com.dydko.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.cucumber.steps", // Pakiet, gdzie znajdują się Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunCucumberTest {
}