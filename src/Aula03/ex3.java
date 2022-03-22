package Aula03;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int N = -1;
        int x = 1;
        int divs = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Insira o número: ");
            if (!input.hasNextInt()) {
                System.err.println("O valor deve ser um número inteiro!");

            } else {
                N = input.nextInt();
                if (N < 0) {
                    System.err.println("O valor deve ser positivo");
                }

            }

        } while (N < 0);

        while (x <= N) {
            if (N % x == 0) {
                divs++;
                x++;
            } else {
                x++;
            }
        }
        if (divs <= 2) {
            System.out.print(N + " is prime");
        } else {
            System.out.print(N + " is not prime");
        }
        input.close();
    }

}
