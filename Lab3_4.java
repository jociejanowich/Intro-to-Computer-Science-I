// **********************************************
// COSC 236                LAB #2
// YOUR NAME: Jocelyn Janowich
// DUE-DATE: 2/19/25
// PROGRAM-NAME: Lab3_3
// Compute items states tax, country tax, and total tax
//**********************************************
import java.util.*;
public class Lab3_4 {
    public static void main(String[] args) {
        double purchasePrice;
        double statesSaleTax;
        double countrySaleTax;
        double totalSaleTax;
        double totalSale;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter purchase price:");
            purchasePrice = scan.nextDouble();
        }
        statesSaleTax = purchasePrice * 0.04;
        countrySaleTax = purchasePrice * 0.02;
        totalSaleTax = statesSaleTax + countrySaleTax;
        totalSale = totalSaleTax + purchasePrice;
        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("State Sales Tax: $" + statesSaleTax);
        System.out.println("Country Sales Tax: $" + countrySaleTax);
        System.out.println("Total Sale Tax: $" + totalSaleTax);
        System.out.println("Total Sale: $"+ totalSale);

    }
}
