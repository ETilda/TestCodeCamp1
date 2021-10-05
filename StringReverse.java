package com.company;

public class StringReverse {
    public static void main(String[] args) {
        String d = "Democracy";

        //Using for loop
        int len = d.length();//9
        String rev = "";

        for(int i = len-1; i>=0; i--){
            rev= rev+d.charAt(i);//y
            System.out.println(rev);

            //Using StringBuffer Class
            StringBuffer sf= new StringBuffer(d);
            System.out.println(sf.reverse());

            System.out.println(sf);
            System.out.println(sf.substring(4,8));




        }


    }
}
