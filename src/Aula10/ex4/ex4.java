package Aula10.ex4;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("words.txt"));
        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
        }
    }
}
