package Aula04;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Frase:");
        String text = input.nextLine();
        /*
        Escreva um programa que leia do teclado uma frase e que apresente o seu
        acrónimo.
         */
        //Se a palavra tiver menos de 3 letras nao deve ser considerada

        String[] words = text.split(" ");
        String acronym = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 3) {
                acronym += words[i].charAt(0);
            }
        }
        System.out.println(acronym);
        input.close();
    }

}
