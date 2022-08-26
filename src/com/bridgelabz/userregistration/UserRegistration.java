package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String first_Name;
    static String last_Name;
    static String email;
    static String phoneNo;
    static String password;
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
    public static boolean isValidPhoneNo(String phoneNo)
    {
         String regex = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
        Pattern p = Pattern.compile(regex);
        if (phoneNo == null) {
            return false;
        }
        Matcher m = p.matcher(phoneNo);
        return m.matches();
    }
    public static boolean isValidPassword(String password)
    {
        String passwordregex = "(?=.{8,}).*[A-Z].*$";
        Pattern p = Pattern.compile(passwordregex);
        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);
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
        System.out.println("Your email Address is:"+isValidEmail(email));
        System.out.println("Enter a valid Phone No with Country code :");
        phoneNo=sc.next();
        System.out.println("Your Phone No is:"+isValidPhoneNo(phoneNo));
        System.out.println("Enter a valid Password :");
        password=sc.next();
        System.out.println("your password is :"+isValidPassword(password));
    }}
