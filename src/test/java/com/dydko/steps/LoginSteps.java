package com.dydko.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {

    private String username;
    private String password;
    private boolean isLoggedIn = false;

    // PicoContainer automatycznie wstrzyknie instancję tej klasy, jeśli będzie potrzebna
    public LoginSteps() {
        System.out.println("Konstruktor LoginSteps został wywołany.");
    }

    @Given("użytkownik jest na stronie logowania")
    public void uzytkownikJestNaStronieLogowania() {
        System.out.println("Użytkownik jest na stronie logowania.");
        // Tutaj mogłaby być implementacja nawigacji do strony logowania
    }

    @When("użytkownik wpisze poprawne dane logowania {string} i {string}")
    public void uzytkownikWpiszePoprawneDaneLogowania(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Użytkownik wpisał login: " + username + " i hasło: " + password);
        // Tutaj mogłaby być implementacja interakcji z polem loginu i hasła
        if (username.equals("standard_user") && password.equals("secret_sauce")) {
            isLoggedIn = true;
        }
    }

    @Then("użytkownik powinien zostać przekierowany na stronę główną")
    public void uzytkownikPowinienZostacPrzekierowanyNaStronęGlówną() {
        System.out.println("Sprawdzenie przekierowania na stronę główną.");
        //Assert.assertTrue(isLoggedIn, "Użytkownik nie został zalogowany.");
        // Tutaj mogłaby być implementacja sprawdzenia, czy użytkownik jest na stronie głównej
    }
}