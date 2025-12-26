package com.dydko.steps;


import com.dydko.context.TestContext;
import io.cucumber.java.en.Given;

public class UserLoginSteps {

    private TestContext testContext;

    // Cucumber will automatically inject an instance of TestContext
    public UserLoginSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("user {string} is logged in")
    public void userIsLoggedIn(String userName) {
        testContext.setLoggedInUser(userName);
        System.out.println("UserLoginSteps: User '" + userName + "' logged in.");
    }
}