package Aula03;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        final String NORMAL = "\033[0m";
        final String VERMELHO = "\033[0;31m";
        final String VERMELHO_NEGRITO = "\033[1;31m";

        int year, month, days;
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.print("Ano: ");
                year = input.nextInt();
                break;
            } catch (Exception e) {
                input.nextLine();
                System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO
                        + "O valor introduzido tem de ser um número inteiro!" + NORMAL);
            }
        } while (true);
        do {
            try {
                System.out.print("Mês: ");
                month = input.nextInt();
                if (month >= 1 && month <= 12) {
                    break;
                } else {
                    System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO
                            + "O valor introduzido tem de estar entre 1 e 12" + NORMAL);
                }
            } catch (Exception e) {
                input.nextLine();
                System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO
                        + "O valor introduzido tem de ser um número inteiro!" + NORMAL);
            }
        } while (true);
        input.close();

        if (month == 2) {
            if (year % 400 == 0) {
                days = 29;
            } else if (year % 100 == 0) {
                days = 28;
            }
            if (year % 4 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            } else {
                days = 31;
            }
        }
        System.out.println(String.format("O mês %02d do ano %d tem %02d dias.", month, year, days));

    }
}
