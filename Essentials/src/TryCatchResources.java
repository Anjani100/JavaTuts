import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchResources {
    public static void main(String[] args) {
//        String name = null;
        String name = "";
//        System.out.println(name[0]); // Throws error and kills the program
        try {
            System.out.println(name.charAt(0));
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer: " + e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Index Out of Bounds: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("I've no idea what the hell happened: " + e.getMessage());
        }
        System.out.println("I'm not dead yet!!!");


        var file = new File("src/Hello.txt");
        System.out.println("File exists: " + file.exists());
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            var text = br.readLine();
            System.out.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Still not dead!!!");
    }
}
