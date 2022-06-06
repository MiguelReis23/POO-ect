package Aula11.ex1;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

import java.util.Map;
import java.io.File;

public class ex1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> words = readFile("src/Aula11/major.txt");
        Map<String, Map<String, Integer>> map = new TreeMap<>();
    
        for (int i= 0; i<words.size() -1; i++) {
            String word = words.get(i);
            String nextWord = words.get(i+1);
            if (map.containsKey(word)) {
                Map<String, Integer> mapWord = map.get(word);
                if(mapWord.containsKey(nextWord)) {
                    mapWord.put(nextWord, mapWord.get(nextWord) + 1);
                } else {
                    mapWord.put(nextWord, 1);
                }
            } else {
                Map<String, Integer> mapWord = new TreeMap<>();
                mapWord.put(nextWord, 1);
                map.put(word, mapWord);
            }
        }
        
        for (Map.Entry<String,Map<String,Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "= " + entry.getValue());
            
        }
    }


    public static ArrayList<String> readFile(String filename) throws IOException{

        Scanner input = new Scanner(new File(filename), "UTF-8");

        input.useDelimiter("[\\t\\n\\r.,:'‘’;?!-*{}=+&/()\\[\\]”“\"\\' ]+");

        ArrayList<String> words = new ArrayList<String>();

        while (input.hasNext()){
            String word = input.next();
            if (word.length()>2) words.add(word);

        }
        return words;
    }
}
