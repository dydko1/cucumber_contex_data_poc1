package com.dydko.steps;

import com.dydko.model.User4;
import io.cucumber.java.en.Given;


public class Test4OKSteps {

    private final User4 user4;

    // PicoContainer automatycznie wstrzyknie instancję tej klasy, jeśli będzie potrzebna
    public Test4OKSteps(User4 user4) {
        this.user4 = user4;
        System.out.println("Konstruktor2 !!!");
    }

    @Given("UserName and LastName are Hardcoded4")
    public void uzytkownikJestNaStronieLogowania() {
        user4.setUserName("Mira44444!!!!!!!!!!!");
        user4.setLastName("Dydko44444!!!!!!!!!!!!!!!");
        //mo.setName("dddd");
//        user1X
//                .setUserName("Miro@@@@!!")
//                .setLastName("Dydko@@@@!!");
    }
}