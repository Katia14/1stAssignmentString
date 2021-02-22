package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] words = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};

        System.out.println(Arrays.toString(words));

        int startsWithC = 0;
        int endsWithE = 0;
        int containsE = 0;
        int length5 = 0;


        for (String value : words) {
            if (value.startsWith("C")) {
                startsWithC++;
            }
        }
        System.out.println("\nThere are " + startsWithC + " words starting with 'C' ");

        for (String value : words) {
            if (value.endsWith("e")) {
                endsWithE++;
            }
        }
        System.out.println("\nThere is " + endsWithE + " word ending with 'e' ");

        for (String value : words) {
            if (value.contains("e")) {
                containsE++;
            }
        }
        System.out.println("\nThere are " + containsE + " words contains 'e' ");

        for (String value : words) {
            if (value.length() == 5) {
                length5++;
            }
        }
        System.out.println("\nThere are " + length5 + " words with length '5' ");

        for (String value : words) {
            if (value.contains("te"));
        }
        System.out.println("\nThere are words containing 'te' ");

    }
}
