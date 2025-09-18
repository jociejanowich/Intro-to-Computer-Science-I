// **********************************************
// COSC 236                LAB #2
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 2/19/25
// PROGRAM-NAME: Lab3_1
// Calculate a car's MPG and display on the screen
//**********************************************
import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double mpg;
            System.out.println("Enter miles driven:");
            double miles = scan.nextDouble();
            System.out.println("Enter number of gallons of gas used:");
            double gallons = scan.nextDouble();
            mpg = miles / gallons;
            System.out.print("MPG: " + mpg);
        }

    }
}
