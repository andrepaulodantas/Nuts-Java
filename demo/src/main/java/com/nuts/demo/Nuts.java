package com.nuts.demo;

public class Nuts {
    //Write or describe an algorithm that prints the whole integer numbers to the console from 1 to 100.
    //But for multiples of three print "Nuts" instead of the number and for the multiples of five print "Bolts".
    //For numbers which are multiples of both three and five print "NutsBolts".
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Visual");
            } else if (i % 3 == 0) {
                System.out.println("Nuts");
            } else if (i % 5 == 0) {
                System.out.println("Visual Nuts");
            } else {
                System.out.println(i);
            }
        }
    }
}


