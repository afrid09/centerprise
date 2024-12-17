package com.app.logincode;

import java.util.Scanner;
import java.util.regex.*;

public class Logincode {

    public static boolean validateUsername(String username) {
        if (username == null || username.isEmpty()) 
            return false;

        // Corrected regular expression for username validation
        String usernameRegex = "^[A-Za-z](?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@_.]).{4,19}$";
        Pattern pattern = Pattern.compile(usernameRegex);
        Matcher matcher = pattern.matcher(username);

        return matcher.matches();
    }

    public static boolean validatePassword(String password, String username) {
        if (password == null || password.isEmpty())
        	return false;

        // Password should not be the same as username
        if (password.equals(username)) 
        	return false;

        // Corrected regular expression for password validation
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&+=]).{6,20}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username");
        String username = s.nextLine();
        System.out.println("Enter password");
        String password = s.nextLine();

        if (validateUsername(username)) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Invalid username. Please follow the rules.");
        }

        if (validatePassword(password, username)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid password. Please follow the rules.");
        }
        s.close();
    }
}
