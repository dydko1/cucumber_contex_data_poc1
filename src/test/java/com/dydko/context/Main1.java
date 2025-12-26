package com.dydko.context;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        String inputNumberString = "3374.0"; // Oto Twój string wejściowy
//        String inputNumberString = "1234567.89"; // Oto Twój string wejściowy
        final String pattern = "#,##0.00";

        BigDecimal numberToFormat;
        try {
            numberToFormat = new BigDecimal(inputNumberString);
        } catch (NumberFormatException e) {
            System.err.println("Error: Could not parse string \"" + inputNumberString + "\" to a number. " + e.getMessage());
            return;
        }
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        symbols.setDecimalSeparator(',');
        DecimalFormat formatter = new DecimalFormat(pattern, symbols);
        String formattedNumber = formatter.format(numberToFormat); // Teraz używamy sparsowanej liczby
        System.out.println("Oryginalny string: \"" + inputNumberString + "\"");
        System.out.println("Sformatowana liczba: \"" + formattedNumber + "\""); // Powinno dać "3 374,00"
    }
}
