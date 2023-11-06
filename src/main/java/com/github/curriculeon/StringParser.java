package com.github.curriculeon;

import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if( input == null){
            return null;
        }

        Character[] parsedChars = new Character[input.length()];
            for (int i = 0; i < input.length(); i++) {
            parsedChars[i] = input.charAt(i);
        }
        return parsedChars;

    }

    public static Integer[] parseIntegers(String input) {
        if( input == null){
            return null;
        }
        
        return null;
    }

    public static List<String> toList(String[] input) {
        return null;
    }

    public static String[] parseStrings(String input) {
        return null;
    }
}
