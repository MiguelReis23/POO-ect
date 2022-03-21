package TP;

import java.util.Scanner;

public class EX41 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza algum texto");
        String str = sc.nextLine();
        System.out.println("frase convertida para minusculas");
        System.out.println(str.toLowerCase());
        System.out.println("Ultimo caractere da frase");
        System.out.println(str.charAt(str.length() - 1));
        System.out.println("Os 3 primeiros caracteres");
        System.out.println(str.substring(0, 3));
        sc.close();
        /*String stararray=str.split("  ");
        for (i=0; i<stararray.length; i++)
            System.out.println(stararray[i])
        sc.close();*/
    }
}
