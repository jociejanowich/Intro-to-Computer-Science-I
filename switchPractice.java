// **********************************************
// COSC 236                In Class Practice
// YOUR NAME: Jocelyn Janowich
// PROGRAM-NAME: practice
// In class practice for COSC 236
//**********************************************
import java.util.*;
public class switchPractice{
    public static void main(String [] args){
        //declaration of variables
        Scanner scan = new Scanner(System.in);
        String operator;
        double num1;
        double num2;
        //variable assignments from user 
        System.out.println("Enter operator");
        operator = scan.nextLine();
        System.out.println("Enter 1st number");
        num1 = scan.nextDouble();
        System.out.println("Enter 2nd number");
        num2 = scan.nextDouble();
        //switch sequence to perform operations
        switch(operator){
            case "+":
                System.out.println(num1 +  " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
        }
    }
}
