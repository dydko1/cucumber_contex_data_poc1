Feature: Logowanie Użytkownika

  Scenario: Pomyślne zalogowanie
    Given użytkownik jest na stronie logowania
    When użytkownik wpisze poprawne dane logowania "standard_user" i "secret_sauce"
    Then użytkownik powinien zostać przekierowany na stronę główną