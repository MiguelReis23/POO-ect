package Aula02;

import java.util.Scanner;
import java.lang.Math;
import static java.lang.System.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        double A,B,C,alpha;

        out.print("Cateto A: ");
        A = input.nextDouble();
        out.print("Cateto B: ");
        B = input.nextDouble();
        input.close();

        C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        alpha = Math.toDegrees(Math.atan(B / A));

        out.println("Valor da Hipotenusa= " + C);
        out.println("Valor do ângulo entre A e Hipotenusa= " + alpha + "º");

    }
}
