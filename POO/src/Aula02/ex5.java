package POO.src.Aula02;

import java.util.Scanner;
import static java.lang.System.* ;
public class ex5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(in);
        out.print("Velocidade 1: ");
        if (!input.hasNextDouble())
            err.println("Valor inválido!");
        double v1 = input.nextDouble();

        out.print("Distância 1 : ");
        if (!input.hasNextDouble())
            err.println("Valor inválido!");
        double d1 = input.nextDouble();

        out.print("Velocidade 2 : ");
        if (!input.hasNextDouble())
            err.println("Valor inválido!");
        double v2 = input.nextDouble();

        out.print("Distancia 2 : ");
        if (!input.hasNextDouble())
            err.println("Valor inválido!");
        double d2 = input.nextDouble();
        out.println((d1+d2)/((d1/v1)+(d2/v2)) + "km/h");
        input.close();
    }
}
