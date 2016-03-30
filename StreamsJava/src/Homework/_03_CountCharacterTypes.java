package Homework;

import java.io.*;

/**
 * Created by xxx on 3/24/2016.
 */
public class _03_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        File input = new File("D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\words.txt");
        File output = new File("D:\\Coding\\JAVA\\Homework\\StreamsJava\\src\\Homework\\count-chars.txt");

        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        String line = reader.readLine();
        String text = new String();
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels += 1;
                    break;
                case '!':
                case ',':
                case '.':
                case '?':
                    punctuation += 1;
                case ' ':
                    break;
                default:
                    consonants += 1;
                    break;
            }
        }
        text = String.format("Vowels: %d\r\nConsonants: %d\r\nPunctuation: %d", vowels, consonants, punctuation);
        writer.write(text);
        writer.flush();
        writer.close();
        reader.close();
        int i = 1;

    }
}
