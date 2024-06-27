package se.alex.lexicon;

import java.util.Arrays;

public class ArrayTwoDim {
    public static void main(String[] args) {

        String[][] countriesAndCities = {
                {"Sweden", "Stockholm"},
                {"France", "Marseille"}
        };

        for (int i = 0; i < countriesAndCities.length; i++) {
            System.out.println(countriesAndCities[i][0] + " " + countriesAndCities[i][1]);
        }
    }
}
