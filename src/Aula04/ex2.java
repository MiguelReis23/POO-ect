package Aula04;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Texto: ");
        String text = input.nextLine();
        countDigits(text);
        countSpaces(text);
        islower(text);
        rspaces(text);
        isPalyndrome(text);
        input.close();
    }

    public static void countDigits(String text) {
        int n = 0;
        for (int i = 0; i < text.length(); i++) {

            if (Character.isDigit(text.charAt(i))) {
                n++;
            }
        }
        System.out.println("Number of digits: " + n);
    }

    public static void countSpaces(String text) {
        int n = 0;
        for (int i = 0; i < text.length(); i++) {

            if (Character.isWhitespace(text.charAt(i))) {
                n++;
            }
        }
        System.out.println("Number of spaces: " + n);
    }

    public static void islower(String text) {
        if (text.equals(text.toLowerCase())) {
            System.out.println("Text is lowercase");
        } else {
            System.out.println("Text is not lowercase");
        }
    }

    public static void rspaces(String text) {// remove more than one whitespace
        String newtext="";
        for (int i = 0; i < text.length();i++) {
            if (Character.isWhitespace(text.charAt(i)) && Character.isWhitespace(newtext.charAt(newtext.length()-1)))
            continue;
            newtext += text.charAt(i);
        }
        System.out.println(newtext);
    }   

    public static void isPalyndrome(String text) {
        String text_reverse = "";
        text=text.toLowerCase();
        text=text.replaceAll(" ", "");
        text_reverse=text_reverse.toLowerCase();
        text_reverse=text_reverse.replaceAll(" ", "");
        for (int i = text.length() - 1; i >= 0; i--) {
            text_reverse += text.charAt(i);
        }
        if (text.equals(text_reverse)) {
            System.out.println("Text is a palindrome");
        } else {
            System.out.println("Text is not a palindrome");
        }
        
    }
}