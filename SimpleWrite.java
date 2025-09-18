import java.io.*;
public class SimpleWrite{
    public static void main(String[]args){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("simple.txt"));
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Writing done!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}