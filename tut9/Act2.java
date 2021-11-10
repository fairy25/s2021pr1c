package tut9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        try {
            // open a file for reading
            Scanner sc = new Scanner(new File("hello.txt"));
            ArrayList<String> lines = new ArrayList<>();
            while (sc.hasNext()) {
                // add only non-blank lines
                String line = sc.nextLine();
                if (!line.equals("")) lines.add(line);
            }
            // open another file for writing
            PrintWriter out = new PrintWriter("hello.txt");
            for (String line : lines) {
                if (!line.equals("")) out.println(line);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
