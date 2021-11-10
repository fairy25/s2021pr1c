package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Act1 {
    public static void main(String[] args) {
        // store the file name
        String filename = "hello.txt";
        try {
            // create or open the file for writing
            PrintWriter p = new PrintWriter(filename);
            // write "Hello, World" to the file
            p.println("Hello, World!");
            // close the file
            p.close();
            // open the file for reading
            Scanner sc = new Scanner(new File(filename));
            // read one line of text from the file
            String line = sc.nextLine();
            // print the text out
            System.out.println(line);
            // close the file
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
