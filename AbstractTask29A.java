package com.abstraction;


//Build the blueprint for your company's login page. From the discussions with the
//product team, all login pages will have a username field, password field, forgot password field,
//and sign-in button while other elements like remember me checkbox, continue to home Page,
//OAuth button will not be applicable to all login pages. with your knowledge of
//Abstract classes, Create a class that others developers will have to inherit from.

//create public void, then abstract for compulsory fields

public abstract class AbstractTask29A {
    public abstract void username();
    public abstract void password();
    public abstract void forgetPassword();
    public abstract void signIn();


    //For optional fields, no need for abstraction
    public void rememberMeCheckbox(){
        System.out.println("This is optional.");
    }
    public void continueToHomePage(){
        System.out.println("Not compulsory.");
    }
    public void OAuthButton(){
        System.out.println("Not compulsory");
    }
}
