package Aula03;

import java.util.Scanner;
import java.util.Random;

public class ex7 {
    public static void main(String[] args) {

        final String NORMAL = "\033[0m"; final String VERMELHO = "\033[0;31m"; final String VERMELHO_NEGRITO = "\033[1;31m";

        Random gerador = new Random();
        Scanner input = new Scanner(System.in);
        String resposta;
        int rnd, recebido, tentativas;
        boolean continuar = true;
        do{
            rnd = gerador.nextInt(100) + 1;
            recebido = tentativas = 0;

            do{
                do{
                    try {
                        System.out.print("Adivinhe o número [1;100]: ");
                        recebido = input.nextInt();
                        if (recebido >= 1 && recebido <= 100) {
                            tentativas++;
                            break;
                        } else {
                            System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de estar entre 1 e 100" + NORMAL);
                        }
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.println(VERMELHO_NEGRITO + "ERRO: " + VERMELHO + "O valor introduzido tem de ser um número inteiro!" + NORMAL);
                    }
                }while(true);
                if (recebido>rnd) {
                    System.out.println("O valor gerado é inferior.");
                }
                if (recebido<rnd) {
                    System.out.println("O valor gerado é superior.");
                }
            }while(recebido!=rnd);

            System.out.println("GAME OVER!!");
            System.out.println(String.format("Tentativas: %d.", tentativas));
            
            input.nextLine();
            System.out.print("Deseja continuar? (S/N) ");
            resposta = input.nextLine().toLowerCase();
            if (!(resposta.equals("s")) && !(resposta.equals("sim"))) {
                continuar = false;
            };
        }while(continuar);
        input.close();
    }
}






