package Aula03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = -1;

        do {
            System.out.print("Insira o número: ");
            if (!input.hasNextInt()) {
                System.err.println("O valor deve ser um número inteiro!");

            } else {
                N = input.nextInt();
            if (N<0){
                System.err.println("O valor deve ser positivo");
            }
            
            }

        } while (N < 0);

        while(N>0){
            System.out.println(N);
            N--;
        }
    
        input.close();
    }
}
