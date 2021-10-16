package com.abstraction;

public class homePageDashboardTest implements InterfaceTestTask29B{

    public static void main(String[] args) {
        homePageDashboardTest valParameters= new homePageDashboardTest();
        valParameters.userName();
        valParameters.password();
        valParameters.logIn();
    }
    @Override
    public void userName() {
        System.out.println("The username is correct.");
    }
    @Override
    public void password() {
        System.out.println("Password matches username.");
    }
    @Override
    public void logIn() {
        System.out.println("Login successful.");

    }
}
