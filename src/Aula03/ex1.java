package Aula03;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float NP = -20;
        float NT = -20;

        do {
            System.out.print("Nota Componente Prática(0-20): ");
            if (!input.hasNextFloat()) {
                System.err.println("Nota inválida!");

            } else {
                NP = input.nextFloat();
                if (NP < 0 || NP > 20) {
                    System.err.println("O valor deve ser entre 0 e 20!");
                }
            }
        } while (NP < 0 || NP > 20);

        do {
            System.out.print("Nota Componente Teórica(0-20): ");
            if (!input.hasNextFloat()) {
                System.err.println("Nota inválida!");

            } else {
                NT = input.nextFloat();
                if (NP < 0 || NP > 20) {
                    System.err.println("O valor deve ser entre 0 e 20!");
                }
            }
        } while (NT < 0 || NT > 20);

        double NF = Math.round(0.4 * NP + 0.6 * NT);

        System.out.println(NF);

        input.close();
    }
}
