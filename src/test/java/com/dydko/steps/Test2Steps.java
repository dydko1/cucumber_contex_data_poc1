package com.dydko.steps;

import com.dydko.model.MyUser;
import io.cucumber.java.en.Given;

public class Test2Steps {

    private final MyUser myUser;

    private String username;
    private String password;

    // PicoContainer automatycznie wstrzyknie instancję tej klasy, jeśli będzie potrzebna
    public Test2Steps(MyUser myUser) {
        this.myUser = myUser;
        System.out.println("Konstruktor3 !!!");
    }

    @Given("UserName and LastName are Displayed")
    public void uzytkownikJestNaStronieLogowania() {

        System.out.println("Użytkownik2 jest na stronie logowania ABC=" +
                myUser.getUser2().getUserName() +
                myUser.getUser2().getLastName());
        // Tutaj mogłaby być implementacja nawigacji do strony logowania
    }
}