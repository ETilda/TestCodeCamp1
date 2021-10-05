package com.company;

public class StringAndConcat {
    public static void main(String[] args) {
        //string and string concatenation

        // first concatenation method;
        String noun = "Tilda is";
        String age =" 25 years.";

        System.out.println(noun + age);


        //In the second concatenation, you create a new String to carry out the function and the result
        //will be stored in the new String before printing. Eg
        String newString = noun + age;
        System.out.println(newString);

        //string and primitive concatenation
        String bookName = "All Things Beautiful: ";
        //int chapter = 12;
        //System.out.println(bookName + chapter);

        int chapter = 10 ;
        boolean isLong = false;
        //System.out.println(""+ chapter + isLong);


        //.concat() method
        bookName.concat(chapter+"");
        System.out.println(bookName.concat(chapter+""));






    }



}
