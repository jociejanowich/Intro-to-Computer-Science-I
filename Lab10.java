// **********************************************
// COSC 236                LAB #10
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 4/30/25
// PROGRAM-NAME: Lab10
// Write a Java program that computes a 2 sum
// of numbers given by the user
//**********************************************
import java.util.*;
public class Lab10{
    public static void main(String[]args){
        //variable declaration
        Scanner scan = new Scanner(System.in);
        int k;
        int n;
        //retrieves k and n value from user
        System.out.println("What value do you want K(the target number) to be?:");
        k = scan.nextInt();
        System.out.println("What value do you want n to be(the length of the array)?:");
        n = scan.nextInt();
        //declare length of array
        int [] values = new int[n];
        //assigns values to array
        for(int i = 0; i < n; i++){
            System.out.println("Enter value to be stored in array:");
            values[i] = scan.nextInt();
        }
        
        //compares values in array to see if there are equal to k

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((values[i] + values[j]) == k){
                    System.out.print("[" + i + "," +j + "]");
                }
            }
        }
    }
}