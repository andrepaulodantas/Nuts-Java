package com.nuts.demo;

    public class Consults extends Countries {   
    

    //turns the number of countries in the world
    public static int getCountries() {
        int count = 0;
        for (int i = 0; i < countries.length(); i++) {
            if (countries.charAt(i) == '{') {
                count++;
            }
        }
        return count;
    }



    //finds the countries most language spoken is German
    public static int getCountriesWithMostLanguages(){
        String languages = "de";
        int count = 0;
        for (int i = 0; i < countries.length(); i++) {
            if (countries.charAt(i) == languages.charAt(0) && countries.charAt(i+1) == languages.charAt(1)) {
                count++;
            }
        }
        return count;
    }

    //counts all the languages spoken 
    public static int countOfLanguages(){
        int count = 0;
        for (int i = 0; i < countries.length(); i++) {
            if (countries.charAt(i) == ':') {
                count++;
            }
        }
        return count;
    }

    //find the country with the highest number of official languages
    public static int getCountryWithMostOfficialLanguages(){
        int count = 0;
        int max = 0;
        for (int i = 0; i < countries.length(); i++) {
            if (countries.charAt(i) == ',') {
                count++;
            }
            if (countries.charAt(i) == '}') {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }

    //find the most common official language(s), of all countries
    public static String getMostCommonLanguage(){
        String languages = "";
        int count = 0;
        int max = 0;
        for (int i = 0; i < countries.length(); i++) {
            if (countries.charAt(i) == ',') {
                count++;
            }
            if (countries.charAt(i) == '}') {
                if (count > max) {
                    max = count;
                    languages = "";
                    for (int j = i - 1; j > 0; j--) {
                        if (countries.charAt(j) == ',') {
                            break;
                        }
                        languages = countries.charAt(j) + languages;
                    }
                }
                count = 0;
            }
        }
        return languages;
    }
}
       

