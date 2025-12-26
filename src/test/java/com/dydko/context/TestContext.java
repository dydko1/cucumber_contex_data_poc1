// src/test/java/com/example/cucumber/context/TestContext.java
package com.dydko.context;

import java.util.ArrayList;
import java.util.List;

public class TestContext {

    private String loggedInUser;
    private List<String> orderItems;
    private double orderTotal;

    public TestContext() {
        this.orderItems = new ArrayList<>();
        this.orderTotal = 0.0;
        System.out.println("TestContext: Nowy obiekt kontekstu został utworzony.");
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(String loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public List<String> getOrderItems() {
        return orderItems;
    }

    public void addOrderItem(String item, double price) {
        this.orderItems.add(item);
        this.orderTotal += price;
        System.out.println("TestContext: Dodano przedmiot '" + item + "' do zamówienia.");
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void clearOrder() {
        this.orderItems.clear();
        this.orderTotal = 0.0;
        System.out.println("TestContext: Zamówienie zostało wyczyszczone.");
    }
}