package com.company;
import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {

        String [] [] doubleDimen = new String [4] [3];
        doubleDimen [0][0]  = "grapes";
        doubleDimen [1][0]  = "apple";
        doubleDimen [2][0]  = "pineapple";
        doubleDimen [3][0]  = "mango";

        System.out.println(Arrays.deepToString(doubleDimen));

    }
}
