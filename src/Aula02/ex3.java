package Aula02;

import static java.lang.System.*;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        double M = 0;
        double Ti = 0;
        double Tf = 0;
        out.print("Water quantity(Kg): ");
        if (!input.hasNextDouble())
            System.err.println("Erro: Valor inválido!");
        M = input.nextDouble();
        out.print("Inicial Temperature: ");
        if (!input.hasNextDouble())
            System.err.println("Erro: Valor inválido!");
        Ti = input.nextDouble();
        out.print("Final Temperature: ");
        if (!input.hasNextDouble())
            System.err.println("Erro: Valor inválido!");
        Tf = input.nextDouble();
        out.print("Necessary Energy(J): ");
        out.print(M * (Tf - Ti) * 4184);
        input.close();

    }
}
