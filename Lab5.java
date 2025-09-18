// **********************************************
// COSC 236                LAB #5
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 3/12/25
// PROGRAM-NAME: Lab5
// Write a program that prompts the user for two 
// students' overall scores and that computes their letter grades based on
// those scores
//**********************************************
import java.util.*;
public class Lab5{
    public static void main(String[]args){
        //declarations
        double student1Score;
        double student1Grade;
        boolean student1Pass;
        double student2Score;
        double student2Grade;
        boolean student2Pass;
        Scanner scan = new Scanner(System.in);
        //student 1 read in and conversion
        System.out.println("What score did you get student 1?");
        student1Score = scan.nextDouble();
        if (student1Score >= 95){
            student1Grade = 4.0;
        }
        else if (student1Score < 60) {
            student1Grade = 0.0;
        }
        else{
            student1Grade = (student1Score - 55) / 10; 
            
        }
        if (student1Grade >= 2.0){
            student1Pass = true;
        }
        else{
            student1Pass = false;
        }
        System.out.println("What score did you get student 2?");
        student2Score = scan.nextDouble();
        if (student2Score >= 95){
            student2Grade = 4.0;
        }
        else if (student2Score < 60) {
            student2Grade = 0.0;
        }
        else{
            student2Grade = (student2Score - 55) / 10; 
            
        }
        if (student2Grade >= 2.0){
            student2Pass = true;
        }
        else{
            student2Pass = false;
        }
        System.out.println("Student 1:");
        System.out.println("Score: " + student1Score);
        System.out.printf("You recieved a grade of %.1f%n", student1Grade);
        if (student1Pass == true){
            System.out.println("You passed the course.");
            System.out.println("You may advance to the next course.");
        } 
        else{
            System.out.println("You failed the course.");
            System.out.println("You must take this course again.");
        }
        System.out.println();
        System.out.println("Student 2:");
        System.out.println("Score: " + student2Score);
        System.out.printf("You recieved a grade of %.1f%n", student2Grade);
        if (student2Pass == true){
            System.out.println("You passed the course.");
            System.out.println("You may advance to the next course.");
        } 
        else{
            System.out.println("You failed the course.");
            System.out.println("You must take this course again.");
        }
    }
}