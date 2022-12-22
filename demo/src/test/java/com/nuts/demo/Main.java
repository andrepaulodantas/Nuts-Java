package com.nuts.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Main {

    @Test
    void contextLoads() {
        System.out.println(Consults.getCountries());
        System.out.println(Consults.getCountriesWithMostLanguages());
        System.out.println(Consults.countOfLanguages());
        System.out.println(Consults.getCountryWithMostOfficialLanguages());
        System.out.println(Consults.getMostCommonLanguage());
    }
}
