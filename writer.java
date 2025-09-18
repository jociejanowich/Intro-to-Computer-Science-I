import java.io.*;
public class writer {
    public static void main(String[]args){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("simple.txt"));
            writer.write("Hello, World!");
            writer.write(" How are you?");
            writer.close();
            System.out.println("writing done!");
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
