package Aula12.ex1;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        // Scanner input2 = new Scanner(new File("src/Aula12/ex1/text.txt"));  ficheiro de teste
//         String currentPath = new java.io.File(".").getCanonicalPath();
//  System.out.println("Current dir:" + currentPath);

//  String currentDir = System.getProperty("user.dir");
//  System.out.println("Current dir using System:" + currentDir);
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do ficheiro: ");
        String ficheiro = input.nextLine();
        Scanner input2 = new Scanner(new FileReader(ficheiro));
        

        input2.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");
        List<String> words =new ArrayList<String>();

        while (input2.hasNext()){
            String word = input2.next();
            words.add(word);
        }
        System.out.println(ficheiro);
        System.out.println(words.size());
        System.out.println(new HashSet<String>(words).size());
        input2.close();
        input.close();
}
}
