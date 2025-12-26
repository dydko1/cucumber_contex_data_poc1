// src/test/java/com/example/cucumber/steps/OrderSteps.java
package com.dydko.steps;

import com.dydko.context.TestContext;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class OrderSteps {

    private TestContext testContext;

    // Cucumber will automatically inject an instance of TestContext
    public OrderSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("{string} adds {string} to the cart")
    public void userAddsItemToCart(String userName, String itemDetails) {
        // Optional: Verify the user is actually logged in
        assertEquals("Incorrect logged in user", userName, testContext.getLoggedInUser());

        String itemName = itemDetails.substring(0, itemDetails.indexOf(" ("));
        double itemPrice = Double.parseDouble(itemDetails.substring(itemDetails.indexOf(" (") + 2, itemDetails.indexOf(")")));

        testContext.addOrderItem(itemName, itemPrice);
        System.out.println("OrderSteps: " + userName + " adding '" + itemName + "' to cart for " + itemPrice);
    }

    @Then("the total order amount should be {double}")
    public void totalOrderAmountShouldBe(double expectedTotal) {
        assertEquals("Incorrect total order amount", expectedTotal, testContext.getOrderTotal(), 0.001);
        System.out.println("OrderSteps: Total order amount is " + testContext.getOrderTotal());
    }

    @Then("the order should contain {string} and {string}")
    public void orderShouldContainItems(String item1, String item2) {
        assertTrue("Order should contain " + item1, testContext.getOrderItems().contains(item1));
        assertTrue("Order should contain " + item2, testContext.getOrderItems().contains(item2));
        System.out.println("OrderSteps: Order contains " + item1 + " and " + item2);
    }
}