package se.alex.lexicon;

import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {

        String[] cities = {"Paris", "London", "New York", "Stockholm"};


        System.out.println("String Arrays: " + Arrays.toString(cities));

        Arrays.sort(cities);


        System.out.println("Sorted string array: " + Arrays.toString(cities));
    }
}
