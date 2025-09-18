// **********************************************
// COSC 236                LAB #7
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 4/2/25
// PROGRAM-NAME: Lab 7
// Write a Java code that creates a pyramid
// made out of the '*' character. the pyramid 
// should be a number of layers deep equal to a 
// number input by the user. 
//**********************************************
import java.util.*;
public class Lab7{
    public static void main(String[] args) {
        //variables
        int input;
        Scanner scan = new Scanner(System.in);
        //user input
        System.out.println("Enter number of layers deep you would like the pyramid to be:");
        input = scan.nextInt();
        //loop for lines
        for(int i = 0; i < input; i++){
            //loop for spaces
            for(int l = 0; l < input - i - 1; l++){
                    System.out.print(" ");
            }
            //loop for stars
            for (int j = 0; j <(2 * i +1); j++){
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
}