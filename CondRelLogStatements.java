package com.company;
public class CondRelLogStatements {
    public static void main(String[] args) {
        int number = 45;


        //Task 17: If the number is divisible by 3, print Fizz instead of the number.
        if (number % 3==0) {
           //System.out.println("Fizz");
        }
        //If the number is divisible by 5, print Buzz instead of the number.
        else if (number % 5== 0) {
            System.out.println("Buzz");
        }
        //If the number is divisible by 3 and 5 both, print FizzBuzz instead of the number.
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }

    }
}