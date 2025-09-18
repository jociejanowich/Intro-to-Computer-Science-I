// **********************************************
// COSC 236                LAB #4
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 3/5/24
// PROGRAM-NAME: Lab4
// Write a Java program that computes a student's total score. 
//**********************************************
import java.util.*;
public class Lab4 {
    public static void main(String[] args) {
        double test1;
        double test2;
        double finalScore;
        double assignments;
        double totalScore;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Test 1 Score:");
        test1 = scan.nextDouble();
        System.out.println("Enter Test 2 Score:");
        test2 = scan.nextDouble();
        System.out.println("Enter Final Score:");
        finalScore = scan.nextDouble();
        System.out.println("Enter Assignments:");
        assignments = scan.nextDouble();
        totalScore = (test1 * .15) + (test2 * .15) + (finalScore * .4) + (assignments *.3);
        System.out.print("Total Score: " + totalScore);
    }
}