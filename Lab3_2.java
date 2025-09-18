// **********************************************
// COSC 236                LAB #2
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 2/19/25
// PROGRAM-NAME: Lab3_2
// Calculate and display test scores and average of scores
//**********************************************
import java.util.*;
public class Lab3_2 {
    public static void main(String[] args) {
        double test1;
        double test2;
        double test3;
        double avg;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first tests score:");
            test1 = scan.nextDouble();
            System.out.println("Enter second tests score:");
            test2 = scan.nextDouble();
            System.out.println("Enter third tests score");
            test3 = scan.nextDouble();
        }
        avg = (test1 + test2 + test3) / 3;
        System.out.println("First test: " + test1 + "%");
        System.out.println("Second test: " + test2 + "%");
        System.out.println("Third test: " + test3 + "%");
        System.out.println("Average test score: " + avg + "%");
    }
}
