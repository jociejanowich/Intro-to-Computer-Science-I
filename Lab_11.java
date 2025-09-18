// **********************************************
// COSC 236                LAB #11
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 5/7/25
// PROGRAM-NAME: Lab 11
// Write a java code which validates a 'password' string
//**********************************************
import java.util.*;
public class Lab_11{
    public static void main(String[]args){
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password: ");
        password = scan.nextLine();
        CheckPassword(password);
    }
    //checks password
    public static void CheckPassword(String password){
        boolean uppercase = isUppercase(password);
        boolean lowercase = isLowercase(password);
        boolean longEnough = isLongEnough(password);
        boolean isNotPassword = isPassword(password);
        boolean specialCharacter = isSpecialCharacter(password);
        if((uppercase == true)&& (lowercase == true) && (longEnough == true) && (isNotPassword ==true) && (specialCharacter == true)){
            System.out.println("Valid password");
        }
        else{
            if(uppercase == false){
                System.out.println("Must contain an uppercase letter");
            }
            if(lowercase == false){
                System.out.println("Must contain a lowercase letter");
            }
            if(longEnough == false){
                System.out.println("Must be at least 12 letters long");
            }
            if(isNotPassword == false){
                System.out.println("Cannot be password");
            }
            if(specialCharacter == false){
                System.out.println("Must contain special character");
            }
        }


    }
    //checks for uppercase
    public static boolean isUppercase(String password){
        for(int i = 0; i < password.length()-1; i++){
            if (Character.isUpperCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    //checks for lowercase
    public static boolean isLowercase(String password){
        for(int i = 0; i < password.length()-1; i++){
            if (Character.isLowerCase(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    //checks for special characters
    public static boolean isSpecialCharacter(String password){
        for(int i = 0; i < password.length()-1; i++){
            char letter = password.charAt(i);
            if(!Character.isLetterOrDigit(letter)){
                return true;
            }
        }
        return false;
    }
    //checks for at least 12 characters
    public static boolean isLongEnough(String password){
        if(password.length() >= 12){
            return true;
        }
        return false;
    }
    //checks for "password"
    public static boolean isPassword(String password){
        if(password.equals("password")){
            return false;
        }
        return true;
    }
}