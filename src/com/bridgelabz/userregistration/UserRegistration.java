package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String first_Name;
    static String last_Name;
    static String email;
    public static boolean isValidUsername(String name)
    {
        String regex = "^[A-Z][a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static boolean isValidEmail(String email)
    {
        String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern p = Pattern.compile(emailregex);
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter First Name : ");
        Scanner sc = new Scanner(System.in);
        first_Name = sc.next();
        System.out.println("First name is :" + isValidUsername(first_Name));
        System.out.println("Enter Last Name : ");
        last_Name = sc.next();
        System.out.println("Last name is :" + isValidUsername(last_Name));
        System.out.println("Enter your email :");
        email=sc.next();
        System.out.println("Your email Address :"+isValidEmail(email));

    }}
