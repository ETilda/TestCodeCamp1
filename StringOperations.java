package com.company;

public class StringOperations {
    public static void main(String[] args) {
        String word = "interOPErability";

        //uppercase and lowercase

        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        //length
        System.out.println(word.length());

        //index of a character
        System.out.println(word.indexOf("P"));

        //character at a particular index
        word.charAt(9);
        System.out.println(word.charAt(9));

        //To get characters from a word
        word.substring(0,5);
        System.out.println(word.substring(0,5));

        word.subSequence(5,10);
        System.out.println(word.subSequence(5,10));

        System.out.println(word.charAt(word.length()-1));

    }
}
