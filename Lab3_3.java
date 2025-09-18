// **********************************************
// COSC 236                LAB #2
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 2/19/25
// PROGRAM-NAME: Lab3_3
// Calculate the amount of proft earned for product
//**********************************************
import java.util.*;
public class Lab3_3 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Double retailPrice;
            Double profit;
            System.out.println("Enter retail price of circuit board:");
            retailPrice = scan.nextDouble();
            profit = retailPrice * 0.4;
            System.out.println("Profit: $" + profit);
        }
    }
}
