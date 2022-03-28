package Aula04;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Texto: ");
        String text = input.nextLine();
        Lowercase(text);
        LastChar(text);
        First3char(text);
        NoSpacing(text);
        Size(text);
        UpperCase(text);
        input.close();
    }

    public static void Lowercase(String texto) {
        String text_lower = texto.toLowerCase();// Transforma todo o texto em minusculo
        System.out.println(text_lower);
    }

    public static void LastChar(String texto) {
        System.out.println(texto.charAt(texto.length() - 1));// Ultimo caracter
    }

    public static void First3char(String texto) {

        System.out.println(texto.substring(0, 3));// 3 primeiros caracteres
    }

    public static void NoSpacing(String texto) {
        System.out.println(texto.replace(" ", ""));// Remove espaços
    }

    public static void Size(String texto) {
        System.out.println(texto.length());// Tamanho do texto
    }

    public static void UpperCase(String texto) {
        System.out.println(texto.toUpperCase());// Transforma todo o texto em maiusculo
    }
}
