package com.company;
import java.util.Scanner;

// Task 22: Create a method that verifies that visitors on the slack channel are coming for testify training.
// If they write '' Testify" then print out a welcome message if not, the user should be shown a rejection message.
//after creating this method, then invoke the created method in your main method.


public class JavaMethods {
    public static void main(String[] args) {

        JavaMethods methodVar= new JavaMethods();
        methodVar.testifyNew();

    }
    public void testifyNew(){
        Scanner verify = new Scanner(System.in);
        String visitorInput ="";

        while (true){
            if ((!visitorInput.equalsIgnoreCase("Testify")) ){
                System.out.println("Try again.");
                visitorInput = verify.nextLine();
                continue;
            }else if (visitorInput.equalsIgnoreCase("Testify")){

                System.out.println("Welcome, please enter password");

                break;

            }


        }


    }
}

