package Aula10.ex3;

import java.util.ArrayList;
import java.util.HashMap;


public class ex3 {
    public static void main(String[] args) {
        System.out.println(charPosition("Hello World"));
        System.out.println(charPosition("Isto e um teste"));
    }

    public static HashMap<String, ArrayList<Integer>> charPosition(String texto){
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < texto.length(); i++) {
            String c = texto.substring(i, i+1);
            if (map.containsKey(c)){
                map.get(c).add(i);
            }else{
                map.put(c, new ArrayList<Integer>());
                map.get(c).add(i);
                
        }
    }
    return map;

}
}
