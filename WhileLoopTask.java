package com.company;

import java.util.Scanner;

public class WhileLoopTask {
    public static void main(String[] args) {

// Task21B
        Scanner scanner =new Scanner(System.in);
        String userInput="";
        while (true) {
            if (userInput.equalsIgnoreCase("Testify")){
                System.out.println("Operation failed, please try again");
                userInput = scanner.nextLine();
                continue;

            }else if (userInput.equalsIgnoreCase("Testify")){
                userInput = scanner.nextLine();
                System.out.println("Testify");

            }

        }

    }


}

