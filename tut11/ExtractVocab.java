package tut11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class ExtractVocab {
    public static void main(String[] args) throws IOException {
        String fullText = "";
        Scanner sc = new Scanner(new File("story.txt"));
        while (sc.hasNext()) {
            fullText += sc.nextLine() + " ";
        }
        fullText = fullText.toLowerCase();
        String[] words = fullText.split(" ");
        TreeSet<String> vocab = new TreeSet<>();
        for (String w : words) {
            vocab.add(w);
        }
        System.out.println(vocab);
    }
}
