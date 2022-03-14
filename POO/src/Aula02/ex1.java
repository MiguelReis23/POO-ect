package POO.src.Aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class ex1 {
    public static void main(String[] args) {

        Scanner a = new Scanner(in);
        double distKm = 0;
        do {
            out.print("Distância Km: ");
            if (!a.hasNextDouble())
                err.println("Erro:Entrada inválida!");
            else {
                distKm = a.nextDouble();
                if (distKm < 0)
                    err.println("ERRO: Distância Negativa!");
            }
        } while (distKm < 0);
        out.println("Miles: " + distKm / 1.609);
        a.close();
    }
}
