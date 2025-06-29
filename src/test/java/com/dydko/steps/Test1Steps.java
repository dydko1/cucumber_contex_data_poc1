package com.dydko.steps;

import com.dydko.model.MyUser;
import io.cucumber.java.en.Given;


public class Test1Steps {

    private final MyUser myUser;

    private String username;
    private String password;

    // PicoContainer automatycznie wstrzyknie instancję tej klasy, jeśli będzie potrzebna
    public Test1Steps(MyUser myUser) {
        this.myUser = myUser;
        System.out.println("Konstruktor2 !!!");
    }

    @Given("UserName and LastName are Hardcoded")
    public void uzytkownikJestNaStronieLogowania() {

        myUser.getUser2().setUserName("Mira111111111");
        myUser.getUser2().setLastName("Dydko22222");
        System.out.println("Użytkownik2 jest na stronie logowania.");
    }
}