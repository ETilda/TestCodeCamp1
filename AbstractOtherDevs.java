package com.abstraction;

public class AbstractOtherDevs extends AbstractTask29A{

    public static void main(String[] args) {
        AbstractOtherDevs devAccess= new AbstractOtherDevs();

        devAccess.username();
        devAccess.password();
        devAccess.forgetPassword();
        devAccess.signIn();
    }

    @Override
    public void username() {
        System.out.println("Username is COMPULSORY.");
    }

    @Override
    public void password() {
        System.out.println("Input password to proceed.");
    }
    @Override
    public void forgetPassword() {
        System.out.println("You can reset your forgotten password.");
    }

    @Override
    public void signIn() {
        System.out.println("Tap on the sign in button to continue.");
    }
}