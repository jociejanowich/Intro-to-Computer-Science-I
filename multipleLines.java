import java.io.*;
public class multipleLines{
    public static void main(String [] args){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("multilines.txt", true));
            writer.write("Line 1");
            writer.newLine();
            writer.write("Line 2");
            writer.newLine();
            writer.write("Line 3");
            writer.newLine();
            writer.close();
            System.out.println("Multiple lines written!");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}