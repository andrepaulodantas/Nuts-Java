package com.nuts.demo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main{
    public static void main(String[] args) {
        System.out.println(Consults.getCountries());
        System.out.println(Consults.getCountriesWithMostLanguages());
        System.out.println(Consults.countOfLanguages());
        System.out.println(Consults.getCountryWithMostOfficialLanguages());
        System.out.println(Consults.getMostCommonLanguage());
    }
}

