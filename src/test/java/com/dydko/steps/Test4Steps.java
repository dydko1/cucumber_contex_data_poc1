package com.dydko.steps;

import com.dydko.model.User4;
import io.cucumber.java.en.Given;

public class Test4Steps {

    private final User4 user4;

    // PicoContainer automatycznie wstrzyknie instancję tej klasy, jeśli będzie potrzebna
    public Test4Steps(User4 myUser4) {
        this.user4 = myUser4;
        System.out.println("Konstruktor4 !!!");
    }

    @Given("UserName and LastName are Displayed4")
    public void uzytkownikJestNaStronieLogowania4() {

        System.out.println("dddddddddddddddddddddddddddddd");

        System.out.println("Użytkownik4 jest na stronie logowania ABC=" +
                user4.getUserName() +
                user4.getLastName());
        // Tutaj mogłaby być implementacja nawigacji do strony logowania
    }
}