package com.company;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome, please input your date of birth.");
        short dob = userInput.nextShort();
        short presentYear = 2021;
        int customersAge = presentYear - dob;
        System.out.println("You are "+ customersAge+" years old");

        if (customersAge<18) {
            System.out.println("Too young to bet. Bye");

       } else if (customersAge>=18){

        }
        System.out.println("Welcome, you're eligible.");


        //Build a Simple interest calculator.
        //Write a program to ask the user for the necessary field you need in calculating the
        // simple interest and then communicate the
        //simple interest back to the user is a good sentence

        Scanner calDetails = new Scanner(System.in);
        System.out.println("input principal, rate, time and press Enter.");

        float Principal = calDetails.nextFloat();
        float Rate =calDetails.nextFloat();
        float Time =calDetails.nextFloat();

        Float simpleInterest = (Principal * Rate * Time)/100;
        System.out.println("Your simple interest is " + simpleInterest);

    }
}




