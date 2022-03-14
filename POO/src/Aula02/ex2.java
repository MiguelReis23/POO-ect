package POO.src.Aula02;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        System.out.print("Temperatura(ºC): ");

        if (!sc.hasNextDouble() && sc.nextDouble()<0)
            System.err.println("Erro: Valor inválido!");
        celsius = sc.nextDouble();
        
        System.out.print("Temperatura(ºF):" + (celsius * 1.8 + 32));
        sc.close();
    }
}

