package tut10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Act2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arList = new ArrayList<>();
        arList.add("String 1");
        arList.add("String 2");
        arList.add("String 3");
        // data.bin will be at project's root folder
        FileOutputStream fos = new FileOutputStream("data.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(arList);
        oos.close();
        System.out.println("ArrayList has been written into data.bin");
    }
}
