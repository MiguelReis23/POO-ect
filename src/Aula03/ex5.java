package Aula03;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        final String NORMAL = "\033[0m"; final String VERMELHO = "\033[0;31m"; final String VERMELHO_NEGRITO = "\033[1;31m";

        double balance, juros;
        final int meses = 12;
        Scanner input = new Scanner(System.in);

        do{
            try {
                System.out.print("Investimento inicial (EUR): ");
                balance = input.nextDouble();
                if (balance % 1000 == 0){
                    break;
                } else {
                    System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de ser múltiplo de 1000!" + NORMAL);
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de ser um número!" + NORMAL);
            }
        }while(true);
        do{
            try {
                System.out.print("Taxa de juros (%): ");
                juros = input.nextDouble();
                if (juros <= 5 && juros >= 0) {
                    break;
                } else {
                    System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de estar entre 0% e 5%" + NORMAL);
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de ser um número!" + NORMAL);
            }
        }while(true);
        input.close();
        for (int i=1; i<= meses; i++) {
            balance += balance*(juros/100);
            System.out.println(String.format("Balanço no fim de %02d meses  (EUR): %.2f", i , balance));
        }

    }
}
